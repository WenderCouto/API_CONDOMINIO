import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Condominio } from '../Interface/CondominioInterface';
import { CondominioService } from '../service/condominio.service';

@Component({
  selector: 'app-listar-condominios',
  templateUrl: './listar-condominios.component.html',
  styleUrls: ['./listar-condominios.component.css'], // Corrigido para styleUrls
})
export class ListarCondominiosComponent implements OnInit {
  listaCondominio: Condominio[] = [];

  constructor(private service: CondominioService) {}

  ngOnInit(): void {
    this.service.listar().subscribe((page) => {
      this.listaCondominio = page.content;
    });
  }

  listarApartamentos():void{

  }

}
