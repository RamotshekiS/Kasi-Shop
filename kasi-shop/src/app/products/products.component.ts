import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';

interface Product {
id: number;
name: string;
brand: string;
description: string;
price: number;
inventory: number;
category?: { id: number; name: string };
images?: { imageId: number; imageName: string; downloadUrl: string }[];
}



@Component({
selector: 'app-products',
standalone: false,
templateUrl: './products.component.html',
styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
products: Product[] = [];

constructor(private productService: ProductService) {}

  ngOnInit() {
    this.productService.getAllProducts().subscribe({
      next: (data) => this.products = data,
      error: (err) => console.error('Error fetching products', err)
    });
  }

 getProductImage(product: Product): string {
  if (product.images?.length) {
    const url = 'http://localhost:8080' + product.images[0].downloadUrl;
    console.log('Product image URL:', url);
    return url;
  }
  return 'assets/default-product.jpeg';
}




  addToCart(product: Product) {
    console.log('Add to cart:', product);
    // Implement cart logic here
  }
}
