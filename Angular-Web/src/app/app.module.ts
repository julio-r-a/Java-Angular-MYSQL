import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './Produc/listar/listar.component';
import { AgregarComponent } from './Produc/agregar/agregar.component';
import { EditarComponent } from './Produc/editar/editar.component';
import { FormsModule } from '@angular/forms';
import { ServiceService } from './Service/service.service';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegistroComponent } from './registro/registro.component';
import { NostrosComponent } from './nostros/nostros.component';
import { TiendasComponent } from './tiendas/tiendas.component';
import { ReservasComponent } from './reservas/reservas.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegistroComponent,
    NostrosComponent,
    ListarComponent,
    AgregarComponent,
    EditarComponent,
    TiendasComponent,
    ReservasComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
