import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  categories: any[] = [];
  private baseUrl = 'http://localhost:3010/categories'; // Replace with your backend URL

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.fetchCategories();
  }

  fetchCategories(): void {
    this.http.get<any[]>(this.baseUrl)
      .subscribe(
        (data) => {
          this.categories = data;
          console.log('Categories:', this.categories);
        },
        (error) => {
          console.error('Error fetching categories:', error);
        }
      );
  }
}
