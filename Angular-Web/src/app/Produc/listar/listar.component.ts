import { Component, OnInit } from '@angular/core';
import { Produc } from 'src/app/Modelo/Produc';
import { ServiceService } from '../../Service/service.service'
import { Router } from '@angular/router';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  produc: Produc[];
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit() {
    this.service.getProduc()
      .subscribe(data => {
        this.produc = data;
      });
  }
  Editar(produc:Produc):void{
    localStorage.setItem("idProducto",produc.idProducto.toString());
    this.router.navigate(["editar"]);
  }

  Delete(produc:Produc){
    this.service.deleteProduc(produc)
    .subscribe(data=>{
      this.produc=this.produc.filter(p=>p!==produc);
      alert("Usuario eliminado...");
    })
  }

  Listar() {
    this.router.navigate(["listar"]);
  }
  Nuevo(){
    this.router.navigate(["agregar"]);
  }

}

