import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Apartamento } from '../Interface/ApartamentoInterface';

@Injectable({
  providedIn: 'root',
})
export class ApartamentoService {

  private apiUrl = 'http://localhost:8080/apartamentos';

  constructor(private http: HttpClient) {}

  listar(condominioId: number):Observable<Apartamento[]>{
    return this.http.get<Apartamento[]>(`${this.apiUrl}/${condominioId}`);
  }

  criar(apartamento: Apartamento):Observable<Apartamento>{
    return this.http.post<Apartamento>(this.apiUrl, apartamento)
  }

}
