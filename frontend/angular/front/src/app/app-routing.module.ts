import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarCondominiosComponent } from './listar-condominios/listar-condominios.component';
import { ListarApartamentoComponent } from './listar-apartamento/listar-apartamento.component';
import { CriarApartamentoComponent } from './criar-apartamento/criar-apartamento.component';
import { CriarCondominioComponent } from './criar-condominio/criar-condominio.component';
import { EditarCondominioComponent } from './editar-condominio/editar-condominio.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'listarCondominio',
    pathMatch: 'full',
  },
  {
    path: 'listarCondominio',
    component: ListarCondominiosComponent,
  },
  {
    path: 'apartamentos/:id',
    component: ListarApartamentoComponent,
  },
  {
    path: 'criarApartamento/:id',
    component: CriarApartamentoComponent,
  },
  {
    path: 'criarCondominio',
    component: CriarCondominioComponent,
  },
  {
    path: 'editarCondominio/:id',
    component: EditarCondominioComponent

  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
