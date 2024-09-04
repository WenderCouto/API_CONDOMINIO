import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CondominioService } from '../service/condominio.service';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-criar-condominio',
  templateUrl: './criar-condominio.component.html',
  styleUrl: './criar-condominio.component.css'
})
export class CriarCondominioComponent implements OnInit {

  formulario!:FormGroup

  constructor(
    private router: Router,
    private service: CondominioService,
    private formBuilder: FormBuilder
  ){}

  ngOnInit(): void {
    this.formulario = this.formBuilder.group({
      nome:[''],
      endereco: this.formBuilder.group({
        rua:[''],
        cidade:[''],
        estado:[''],
        cep:[''],
        pais:['']

      })
    })
  }

  criarCondominio(){
    this.service.criar(this.formulario.value).subscribe(()=>{
      this.router.navigate(['/'])
    })
  }

  voltar(){
    this.router.navigate(['/'])
  }
}
