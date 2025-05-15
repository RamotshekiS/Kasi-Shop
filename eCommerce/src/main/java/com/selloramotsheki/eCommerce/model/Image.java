package com.selloramotsheki.eCommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Image {
    public String getImage;
    //Setting primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    @Lob
    private Blob image;
    //private Byte[] imageData;
    private String downloadUrl;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
//    public void setFileName(String fileName){
//        this.fileName = fileName;
//    }
//
//    public void setImage(Blob image){
//        this.image = image;
//    }
//
//    public Blob getImage(){
//        return image;
//    }
//
//    public void setFileType(String fileType) {
//        this.fileType = fileType;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setDownloadUrl(String downloadUrl) {
//        this.downloadUrl = downloadUrl;
//    }
//
//    public String getFileName(){
//        return fileName;
//    }
//
//
//    public String getDownloadUrl() {
//        return downloadUrl;
//    }
//
//    public String getFileType() {
//        return fileType;
//    }
}
