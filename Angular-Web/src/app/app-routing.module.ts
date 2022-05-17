import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgregarComponent } from './Produc/agregar/agregar.component';
import { ListarComponent } from './Produc/listar/listar.component';
import { EditarComponent } from './Produc/editar/editar.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegistroComponent } from './registro/registro.component';
import { NostrosComponent } from './nostros/nostros.component';
import { TiendasComponent } from './tiendas/tiendas.component';
import { ReservasComponent } from './reservas/reservas.component';

const routes: Routes = [
  {path: '',component:HomeComponent},
  {path: 'login',component:LoginComponent},
  {path: 'registro',component:RegistroComponent},
  {path: 'nosotros',component:NostrosComponent},
  {path: 'listar',component:ListarComponent},
  {path: 'agregar',component:AgregarComponent},
  {path: 'editar',component:EditarComponent},
  {path: 'tiendas', component:TiendasComponent},
  {path: 'reservas', component:ReservasComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
