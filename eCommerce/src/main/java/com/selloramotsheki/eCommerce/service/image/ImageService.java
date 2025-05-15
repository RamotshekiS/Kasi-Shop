package com.selloramotsheki.eCommerce.service.image;

import com.selloramotsheki.eCommerce.Dto.ImageDto;
import com.selloramotsheki.eCommerce.exeptions.ResourceNotFoundException;
import com.selloramotsheki.eCommerce.model.Image;
import com.selloramotsheki.eCommerce.model.Product;
import com.selloramotsheki.eCommerce.repository.ImageRepository;
import com.selloramotsheki.eCommerce.repository.ProductRepository;
import com.selloramotsheki.eCommerce.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialClob;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



@Service
@RequiredArgsConstructor
public class ImageService implements IImageService{
    private final ImageRepository imageRepository;
    private final ProductRepository productRepository;

    @Override
    public Image getImageById(Long id) {
        return imageRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No Image found with id: " + id));
    }

    @Override
    public void deleteImageById(Long id) {
        imageRepository.findById(id)
                .ifPresentOrElse(imageRepository::delete, () -> {
                    throw new ResourceNotFoundException("No Image found with id: " + id);
                });
    }

    @Autowired
    private ProductService productService;
    @Override
    public List<ImageDto> saveImages(List<MultipartFile> files, Long productId) {
        Product product = productService.getProductById(productId);

        List<ImageDto> savedImageDto = new ArrayList<>();
        for(MultipartFile file : files){
            try{
                Image image = new Image();
                image.setFileName(file.getOriginalFilename());
                image.setFileType(file.getContentType());
                image.setImage(new SerialBlob(file.getBytes()));
                image.setProduct(product);

                String buildDownloadUrl = "/api/v1/images/image/download/";
                String downloadUrl = buildDownloadUrl + image.getId();
                image.setDownloadUrl(downloadUrl);
                Image savedImage = imageRepository.save(image);

                savedImage.setDownloadUrl(buildDownloadUrl + savedImage.getId());
                imageRepository.save(savedImage);

                ImageDto imageDto  = new ImageDto();
                imageDto.setImageId(savedImage.getId());
                imageDto.setImageName(savedImage.getFileName());
                imageDto.setDownloadUrl(savedImage.getDownloadUrl());
                savedImageDto.add(imageDto);

            } catch(IOException | SQLException e){
                throw new RuntimeException(e.getMessage());

            }
        }

        return savedImageDto;
    }

    @Override
    public void updateImage(MultipartFile file, Long imageId) {
        Image image = getImageById(imageId);
        try{
            image.setFileName(file.getOriginalFilename());
            image.setFileName(file.getOriginalFilename());
            image.setImage(new SerialBlob(file.getBytes()));
            imageRepository.save(image);
        } catch(IOException | SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        
    }
}
