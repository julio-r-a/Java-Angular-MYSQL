import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router) { }


  ngOnInit(): void {
  }

  public GuardarI(correo :string, contra : string){    
    if(correo == "satira@gmail.com" && contra == "julio123"){ 
      this.router.navigate(["listar"]);
    }else{
      alert("Contraseña o Correo Incorrecta, Favor de verificar!!!");

    }
    
  }

}
