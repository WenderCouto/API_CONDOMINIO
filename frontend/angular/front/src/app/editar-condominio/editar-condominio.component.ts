import { Component, OnInit } from '@angular/core';
import { CondominioService } from '../service/condominio.service';
import { ActivatedRoute } from '@angular/router';
import { Condominio } from '../Interface/CondominioInterface';

@Component({
  selector: 'app-editar-condominio',
  templateUrl: './editar-condominio.component.html',
  styleUrl: './editar-condominio.component.css'
})
export class EditarCondominioComponent implements OnInit {

  condominio?: Condominio;

  constructor(private service: CondominioService, private route: ActivatedRoute){}

  ngOnInit(): void {
    const condominioId = this.route.snapshot.paramMap.get('id');
    this.service.buscarPorId(Number(condominioId)).subscribe((condominio) => {
      this.condominio = condominio;
      console.log(this.condominio);
    });

  }

}
