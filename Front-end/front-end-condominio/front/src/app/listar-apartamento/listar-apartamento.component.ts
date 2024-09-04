import { Component, OnInit } from '@angular/core';
import { Apartamento } from '../Interface/ApartamentoInterface';
import { ApartamentoService } from '../service/apartamento.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-listar-apartamento',
  templateUrl: './listar-apartamento.component.html',
  styleUrl: './listar-apartamento.component.css',
})
export class ListarApartamentoComponent implements OnInit {
  listaApartamentos: Apartamento[] = [];
  id!: number;
  displayedColumns: string[] = [
    'numero',
    'unidadeConsumidora',
    'descricao',
    'disponivel',
    'valor'
  ];

  constructor(
    private service: ApartamentoService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.id = Number(this.route.snapshot.paramMap.get('id'));
    this.service.listar(this.id).subscribe((apartamento) => {
      this.listaApartamentos = apartamento;
    });
  }

  criarApartamento(): void {
    this.router.navigate([`/criarApartamento/${this.id}`]);
  }

  voltar(){
    this.router.navigate(['/'])
  }
}
