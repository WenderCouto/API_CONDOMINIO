import { NgModule } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatListModule } from '@angular/material/list';
import { HomeComponent } from './home/home.component';
import { ListarCondominiosComponent } from './listar-condominios/listar-condominios.component';
import { HttpClientModule, provideHttpClient, withFetch } from '@angular/common/http';
import { ListarApartamentoComponent } from './listar-apartamento/listar-apartamento.component';
import { RouterModule } from '@angular/router';
import { CriarApartamentoComponent } from './criar-apartamento/criar-apartamento.component';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { MatTableModule } from '@angular/material/table';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CriarCondominioComponent } from './criar-condominio/criar-condominio.component';
import { EditarCondominioComponent } from './editar-condominio/editar-condominio.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListarCondominiosComponent,
    ListarApartamentoComponent,
    CriarApartamentoComponent,
    CriarCondominioComponent,
    EditarCondominioComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatButtonModule,
    MatSidenavModule,
    MatToolbarModule,
    MatListModule,
    HttpClientModule,
    RouterModule,
    MatCardModule,
    MatInputModule,
    MatTableModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [provideHttpClient(withFetch()), provideAnimationsAsync()],
  bootstrap: [AppComponent],
})
export class AppModule {}
