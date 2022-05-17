import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../Service/service.service';
import { Router } from '@angular/router';
import { Cliente } from '../Modelo/Cliente';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  cliente:Cliente=new Cliente();
  constructor(private router:Router, private service:ServiceService) { }
  ngOnInit(){
  }

  GuardarU(){
    this.service.createCliente(this.cliente)
    .subscribe(data=>{
      alert("Se Registro con exito...!!!");
      this.router.navigate(["login"]);
    })
  }

}
