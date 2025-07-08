import { Component, OnInit, Inject } from '@angular/core';
import { Condominio } from '../Interface/CondominioInterface';
import { CondominioService } from '../service/condominio.service';
import { Router } from '@angular/router';
import { isPlatformBrowser } from '@angular/common';
import { PLATFORM_ID } from '@angular/core';

@Component({
  selector: 'app-listar-condominios',
  templateUrl: './listar-condominios.component.html',
  styleUrls: ['./listar-condominios.component.css'],
})
export class ListarCondominiosComponent implements OnInit {
  listaCondominio: Condominio[] = [];

  displayedColumns: string[] = ['nome', 'cidade', 'estado', 'rua', 'listar', 'editar'];

  constructor(
    private service: CondominioService,
    private router: Router,
    @Inject(PLATFORM_ID) private platformId: Object
  ) {}

  ngOnInit(): void {
    if (isPlatformBrowser(this.platformId)) {
      this.service.listar().subscribe((page) => {
        this.listaCondominio = page.content;
      });
    }
  }

  listarApartamentos(condominioId: number): void {
    this.router.navigate([`/apartamentos/${condominioId}`]);
  }

  criarCondominio() {
    this.router.navigate(['/criarCondominio']);
  }

  editarCondominio(condominioId: number): void {
    this.router.navigate([`/editarCondominio/${condominioId}`]);
  }
}
