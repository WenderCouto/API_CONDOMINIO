import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Condominio } from '../Interface/CondominioInterface';

interface Page<T> {
  content: T[];
  totalElements: number;
  totalPages: number;
  size: number;
  number: number;
}

@Injectable({
  providedIn: 'root',
})
export class CondominioService {
  private apiUrl = 'http://localhost:8080/condominios';

  constructor(private http: HttpClient) {}

  listar(): Observable<Page<Condominio>> {
    return this.http.get<Page<Condominio>>(this.apiUrl);
  }


}
