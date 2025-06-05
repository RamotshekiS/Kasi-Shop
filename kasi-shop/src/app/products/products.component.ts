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
images?: { id: number; imageUrl: string }[];
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
  return product.images?.length ? product.images[0].imageUrl : 'assets/default-product.png';
  }


  addToCart(product: Product) {
    console.log('Add to cart:', product);
    // Implement cart logic here
  }
}
