import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarCondominiosComponent } from './listar-condominios/listar-condominios.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'listarCondominio',
    pathMatch: 'full'
  },
  {
    path:'listarCondominio',
    component: ListarCondominiosComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
