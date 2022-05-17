function capturar(){
    var local = document.getElementById("local").value;
    var nombre = document.getElementById("nombre").value;
    var numeroP = document.getElementById("personas").value;
    var correo = document.getElementById("correo").value;
    var dia= document.getElementById("dia").value;
    var mes = document.getElementById("mes").value;
    var ano = document.getElementById("ano").value;
    var hora = document.getElementById("hora").value;

    if(local == ""){
        alert("El nombre del local es obligatorio.");
        document.getElementById("local").focus();
    }else if(nombre == ""){
        alert("El nombre es obligatorio.");
        document.getElementById("nombre").focus();
    }else if(numeroP == ""){
        alert("El numero de personas es obligatorio.");
        document.getElementById("peronas").focus();
    }else if(correo == ""){
        alert("El correo es obligatorio.");
        document.getElementById("correo").focus();
    }else if(dia == ""){
        alert("El dia es obligatorio.");
        document.getElementById("dia").focus();
    }else if(mes == ""){
        alert("El mes es obligatorio.");
        document.getElementById("mes").focus();
    }else if(ano == ""){
        alert("El año es obligatorio.");
        document.getElementById("ano").focus();
    }else if(hora == ""){
        alert("La hora es obligatorio.");
        document.getElementById("hora").focus();
    }else{
        alert("Su reserva fue registrada con exxito.!!")
        console.log(local,nombre,numeroP,correo,dia,mes,ano,hora);
        
    }
}