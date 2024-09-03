import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ApartamentoService } from '../service/apartamento.service';
import { ActivatedRoute, Router } from '@angular/router';



@Component({
  selector: 'app-criar-apartamento',
  templateUrl: './criar-apartamento.component.html',
  styleUrl: './criar-apartamento.component.css',
})
export class CriarApartamentoComponent implements OnInit {
  formulario!: FormGroup;
  idCondominio!: number;

  constructor(
    private service: ApartamentoService,
    private formBuilder: FormBuilder,
    private router: Router,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    this.idCondominio = Number(this.route.snapshot.paramMap.get('id'));

    this.formulario = this.formBuilder.group({
      numero: [''],
      unidadeConsumidora: [''],
      descricao: [''],
      valor: [''],
      idCondominio: [this.idCondominio],
    });
  }

  criarApartamento() {
    this.service.criar(this.formulario.value).subscribe(() => {
      this.router.navigate([`/apartamentos/${this.idCondominio}`]);
    });
  }
}
