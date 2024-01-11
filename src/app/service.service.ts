import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  private url = 'http://localhost:3010/api'

    constructor(private http: HttpClient) {}
saveCagnotte(data: any): Observable<any> {
        return this.http.post(this.url+'/cagnotte', data);
    }
    saveUtilisateur(data: any): Observable<any> {
      return this.http.post(this.url+'/utilisateurs', data);
  }
}
