import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Admin } from './admin';

@Injectable({
  providedIn: 'root'
})
export class AdminServiceService {

  private baseURL = "http://localhost:8080/admin/signin";

  constructor(private httpClient: HttpClient) { }

  signin(cred: Admin): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`,cred);
  }
}
