import { Component, OnInit } from '@angular/core';
import { Produc } from 'src/app/Modelo/Produc';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  produc :Produc=new Produc();
  constructor(private router:Router,private service:ServiceService) { }

  ngOnInit() {
    this.Editar();
  }

  Editar(){
    let idProducto=localStorage.getItem("idProducto");
    this.service.getProducId(+idProducto)
    .subscribe(data=>{
      this.produc=data;
    })

  }
  Actualizar(produc:Produc){
    this.service.updateProduc(produc)
    .subscribe(data=>{
      this.produc=data;
      alert("Se Actualizo con Exito...!!!");
      this.router.navigate(["listar"]);
    })
  }

}
