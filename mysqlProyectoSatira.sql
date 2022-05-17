create database ProyectoSatira;

use ProyectoSatira;

create table reserva(
	id int primary key auto_increment,
    nombre varchar (50),
    numero int,
    correo varchar(50),
    dia varchar(20),
	mes varchar(20),
    ano varchar(20),
    hora varchar(20)
);


create table categoria(
    idCategoria int  NOT NULL auto_increment primary key,
    nombreCategoria varchar(100),
    descripcionCategoria varchar(120),
    fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

create table marca(
idmarca int auto_increment primary key,
nombre varchar(50),
fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

drop table Produc;

create table Produc(
    idProducto int NOT NULL primary key auto_increment,
    nombre varchar(100),
    descripcion varchar(200),
    presentacion varchar(100),
    precio decimal(10,2),
    contenido varchar(10),
    ibu varchar(10),
    volumen varchar(10),
    stock int,
    estado varchar(50),
    procedencia varchar(25),
    categoria varchar(25),
    marca varchar(25)
);

create table Productos(
    idProducto int NOT NULL primary key auto_increment,
    nombre varchar(100),
    descripcion varchar(200),
    imagen varchar(200),
    presentacion varchar(100),
    precio decimal(10,2),
    contenido varchar(10),
    ibu varchar(10),
    volumen varchar(10),
    stock int,
    estado varchar(50),
    procedencia varchar(25),
    categoria int,
    marca int,
    fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    foreign key (categoria) references categoria (idCategoria),
    foreign key (marca) references marca(idmarca)
);

drop table cliente;

create table cliente(
idCliente int not null primary key auto_increment,
nombres varchar(50),
apellidos varchar(50),
Celular char(9),
correo varchar(50),
clave varchar(150)
);

drop table carrito;

create table carrito(
    idCarrito int  not null primary key auto_increment,
    cliente int,
    producto int,
    cantidad int,
    foreign key (cliente) references cliente (idCliente),
    foreign key (producto) references Producto(idProducto)
);

create table medioPago( 
idMedioPago int primary key auto_increment,
nombre varchar(50)
);

drop table venta;

create table venta(
idVenta int not null primary key auto_increment,
idcliente int,
totalProductos int,
montoTotal float,
Direccion varchar(50),
medioPago int,
FechaVenta TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
foreign key (medioPago) references medioPago(idMedioPago),
foreign key (idcliente) references cliente(idCliente)
);

drop table detalleVenta;

create table detalleVenta(
idDetalle int not null primary key auto_increment,
idVenta int,
idProducto int,
cantidad int,
total decimal,
foreign key (idVenta) references venta(idVenta),
foreign key (idProducto) references Producto(idProducto)
);

create  table medioDePago(
	idMedioDePago int primary key auto_increment,
    nombre varchar(25)
);

Insert Into Categoria(nombreCategoria, descripcionCategoria) Values('Lager', 'cervezas claras, para servirse frías con una alta drinkability');
Insert Into Categoria(nombreCategoria, descripcionCategoria) Values('Ales', 'Suelen tener una graduación más alta y sabores más intensos');
Insert Into Categoria(nombreCategoria, descripcionCategoria) Values('negras', 'Cervezas muy oscuras hechas con malta tostada, Una variedad aun más fuerte');
Insert Into Categoria(nombreCategoria, descripcionCategoria) Values('Abadia', 'Una cerveza de color bronceado con una espuma ligeramente tostada y con mucha persistencia');

Insert Into Marca(nombre) Values('Cumbres');
Insert Into Marca(nombre) Values('Califa');
Insert Into Marca(nombre) Values('Barbarian');
Insert Into Marca(nombre) Values('Zátara');
select*from marca;

Insert Into Producto(nombre,descripcion,imagen,presentacion,precio,contenido,ibu,volumen,stock,estado,procedencia,categoria,marca)
Values('MYRDDIN','Bebida alcoholica','img','Botella',7.5,'310 ML','20','4 Vol',22,1,'Peru',2,4);
Insert Into Producto(nombre,descripcion,imagen,presentacion,precio,contenido,ibu,volumen,stock,estado,procedencia,categoria,marca) Values('Barley Wine','Bebida alcoholica','img','Lata',8.5,'310 ML','20','4 Vol',35,1,'Peru',1,1);
Insert Into Producto(nombre,descripcion,imagen,presentacion,precio,contenido,ibu,volumen,stock,estado,procedencia,categoria,marca) Values('INDIA PALE ALE','Bebida alcoholica','img','Botella',9.5,'310 ML','20','4 Vol',10,1,'Peru',3,2);
Insert Into Producto(nombre,descripcion,imagen,presentacion,precio,contenido,ibu,volumen,stock,estado,procedencia,categoria,marca) Values('ChaSki porter','Bebida alcoholica','img','Lata',10.5,'310 ML','20','4 Vol',40,1,'Peru',3,3);

select * from producto;

Insert Into medioPago(nombre) Values ('Tarjeta');
Insert Into medioPago(nombre) Values ('Efectivo');
Insert Into medioPago(nombre) Values ('Movil');

Insert Into cliente(nombres,apellidos,celular,correo,clave) Values ('Jose Carlos','Espinoza','954949874','jose@gmail.com','12345');
Insert Into cliente(nombres,apellidos,celular,correo,clave) Values ('Ana Maria','Cordova','912124536','anama@gmail.com','2468');
Insert Into cliente(nombres,apellidos,celular,correo,clave) Values ('Gustavo','Valdez Suarez','995749821','valdez@gmail.com','13579');
Insert Into cliente(nombres,apellidos,celular,correo,clave) Values ('Patricia','Sanchez','945748545','paty@gmail.com','12345');

Insert Into venta (idcliente,totalProductos,montoTotal,Direccion,medioPago) Values (2,3,50.5,'Av Junin 241',2);
Insert Into venta (idcliente,totalProductos,montoTotal,Direccion,medioPago) Values (3,5,100.2,'La molina',2);
Insert Into venta (idcliente,totalProductos,montoTotal,Direccion,medioPago) Values (2,7,80.5,'Av Junin 241',1);
Insert Into venta (idcliente,totalProductos,montoTotal,Direccion,medioPago) Values (1,10,150,'Surco',3);
Insert Into venta (idcliente,totalProductos,montoTotal,Direccion,medioPago) Values (4,3,33.5,'La molina',2);

SELECT * FROM PRODUCTO;

Insert Into detalleVenta(idDetalle,idVenta,idProducto,cantidad,total)
values(1,2,3,19,30.1);
Insert Into detalleVenta(idDetalle,idVenta,idProducto,cantidad,total)
values(2,1,2,29,40.1);
Insert Into detalleVenta(idDetalle,idVenta,idProducto,cantidad,total)
values(3,3,1,24,50.2);
Insert Into detalleVenta(idDetalle,idVenta,idProducto,cantidad,total)
values(4,2,3,28,60.3);
Insert Into detalleVenta(idDetalle,idVenta,idProducto,cantidad,total)
values(5,1,2,20,70.1);

select * from detalleVenta;


create table detalleVenta(
idDetalle int not null primary key auto_increment,
idVenta int,
idProducto int,
cantidad int,
total decimal,
foreign key (idVenta) references venta(idVenta),
foreign key (idProducto) references Producto(idProducto)
);


