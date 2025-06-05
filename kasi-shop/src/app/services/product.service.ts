import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

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

@Injectable({ providedIn: 'root' })
export class ProductService {
private baseUrl = 'http://localhost:8080/api/v1/products';

constructor(private http: HttpClient) {}

  getAllProducts(): Observable<Product[]> {
    return this.http.get<any>(`${this.baseUrl}/all`).pipe(
      map(res => res.data)
    );
  }

  getProductsByCategory(category: string): Observable<Product[]> {
    return this.http.get<any>(`${this.baseUrl}/products/${category}/all/products`).pipe(
      map(res => res.data)
    );
  }
}
