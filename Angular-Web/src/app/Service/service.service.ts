import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Produc } from '../Modelo/Produc';
import { Cliente } from '../Modelo/Cliente';

@Injectable()
export class ServiceService {

  
  constructor(private http:HttpClient) { }

  Url='http://localhost:8082/satira/produc';
  Ur='http://localhost:8082/satira/cliente';

  getProduc(){
    return this.http.get<Produc[]>(this.Url);
  }
  createProduc(produc:Produc){
    return this.http.post(this.Url,produc);
  }
  getProducId(idProducto:number){
    return this.http.get<Produc>(this.Url+"/"+idProducto);
  }
  updateProduc(produc:Produc){
    return this.http.put<Produc>(this.Url+"/"+produc.idProducto,produc);
  }
  deleteProduc(produc:Produc){
    return this.http.delete<Produc>(this.Url+"/"+produc.idProducto);
  }

  createCliente(cliente:Cliente){
    return this.http.post<Cliente>(this.Ur,cliente);
  }
}
