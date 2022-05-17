(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/Modelo/Producto.ts":
/*!************************************!*\
  !*** ./src/app/Modelo/Producto.ts ***!
  \************************************/
/*! exports provided: Producto */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Producto", function() { return Producto; });
var Producto = /** @class */ (function () {
    function Producto() {
    }
    return Producto;
}());



/***/ }),

/***/ "./src/app/Producto/agregar/agregar.component.css":
/*!********************************************************!*\
  !*** ./src/app/Producto/agregar/agregar.component.css ***!
  \********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL1Byb2R1Y3RvL2FncmVnYXIvYWdyZWdhci5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/Producto/agregar/agregar.component.html":
/*!*********************************************************!*\
  !*** ./src/app/Producto/agregar/agregar.component.html ***!
  \*********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container col-md-6\" >\n    <div class=\"card\" >\n        <div class=\"card-header\">\n            <h3>Agregar Producto</h3>\n        </div>\n        <div class=\"card-body\">\n            <form action=\"\">\n                <div class=\"form-group\">\n                    <label for=\"\">Nombre: </label>\n                    <input [(ngModel)]=\"producto.Nombre\" name=\"nombre\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\" >Descripcion: </label>\n                    <input [(ngModel)]=\"producto.Descripcion\" name=\"descripcion\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Imagen: </label>                    \n                    <input [(ngModel)]=\"producto.Imagen\" name=\"marca\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Presentacion: </label>                    \n                    <input [(ngModel)]=\"producto.Presentacion\" name=\"presentacion\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Precio: </label>                    \n                    <input [(ngModel)]=\"producto.Precio\" name=\"precio\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Contenido: </label>                    \n                    <input [(ngModel)]=\"producto.Contenido\" name=\"contenido\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Ibu: </label>                    \n                    <input [(ngModel)]=\"producto.Ibu\" name=\"ibu\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Volumen: </label>                    \n                    <input [(ngModel)]=\"producto.Volumen\" name=\"volumen\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Stock: </label>                    \n                    <input [(ngModel)]=\"producto.Stock\" name=\"stock\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Estado: </label>                    \n                    <input [(ngModel)]=\"producto.Estado\" name=\"estado\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Procedencia: </label>                    \n                    <input [(ngModel)]=\"producto.Procedencia\" name=\"procedencia\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Categoria: </label>                    \n                    <input [(ngModel)]=\"producto.Categoria\" name=\"categoria\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Marca: </label>                    \n                    <input [(ngModel)]=\"producto.Marca\" name=\"marca\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">FechaRegistro: </label>                    \n                    <input [(ngModel)]=\"producto.FechaRegistro\" name=\"fechaRegistro\" type=\"text\" class=\"form-control\">\n                </div>\n                <button (click)=\"Guardar()\" class=\"btn btn-danger\">Guardar</button>\n            </form>                        \n        </div>\n    </div>\n</div>\n<!-- Evento a agregar (click)=\"guardar()\"-->"

/***/ }),

/***/ "./src/app/Producto/agregar/agregar.component.ts":
/*!*******************************************************!*\
  !*** ./src/app/Producto/agregar/agregar.component.ts ***!
  \*******************************************************/
/*! exports provided: AgregarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AgregarComponent", function() { return AgregarComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var src_app_Modelo_Producto__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! src/app/Modelo/Producto */ "./src/app/Modelo/Producto.ts");
/* harmony import */ var src_app_Service_service_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! src/app/Service/service.service */ "./src/app/Service/service.service.ts");





var AgregarComponent = /** @class */ (function () {
    function AgregarComponent(router, service) {
        this.router = router;
        this.service = service;
        this.producto = new src_app_Modelo_Producto__WEBPACK_IMPORTED_MODULE_3__["Producto"]();
    }
    AgregarComponent.prototype.ngOnInit = function () {
    };
    AgregarComponent.prototype.Guardar = function () {
        var _this = this;
        this.service.createProducto(this.producto)
            .subscribe(function (data) {
            alert("Se Agrego con Exito...!!!");
            _this.router.navigate(["listar"]);
        });
    };
    AgregarComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-agregar',
            template: __webpack_require__(/*! ./agregar.component.html */ "./src/app/Producto/agregar/agregar.component.html"),
            styles: [__webpack_require__(/*! ./agregar.component.css */ "./src/app/Producto/agregar/agregar.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"], src_app_Service_service_service__WEBPACK_IMPORTED_MODULE_4__["ServiceService"]])
    ], AgregarComponent);
    return AgregarComponent;
}());



/***/ }),

/***/ "./src/app/Producto/editar/editar.component.css":
/*!******************************************************!*\
  !*** ./src/app/Producto/editar/editar.component.css ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL1Byb2R1Y3RvL2VkaXRhci9lZGl0YXIuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/Producto/editar/editar.component.html":
/*!*******************************************************!*\
  !*** ./src/app/Producto/editar/editar.component.html ***!
  \*******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container col-md-6\" >\n    <div class=\"card\" >\n        <div class=\"card-header\">\n            <h3>Editar Producto</h3>\n        </div>\n        <div class=\"card-body\">\n            <form action=\"\">\n                <div class=\"form-group\">\n                    <label for=\"\">IdProducto: </label>\n                    <input [(ngModel)]=\"producto.IdProducto\" name=\"idProducto\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Nombre: </label>\n                    <input [(ngModel)]=\"producto.Nombre\" name=\"nombre\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\" >Descripcion: </label>\n                    <input [(ngModel)]=\"producto.Descripcion\" name=\"descripcion\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Imagen: </label>                    \n                    <input [(ngModel)]=\"producto.Imagen\" name=\"marca\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Presentacion: </label>                    \n                    <input [(ngModel)]=\"producto.Presentacion\" name=\"presentacion\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Precio: </label>                    \n                    <input [(ngModel)]=\"producto.Precio\" name=\"precio\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Contenido: </label>                    \n                    <input [(ngModel)]=\"producto.Contenido\" name=\"contenido\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Ibu: </label>                    \n                    <input [(ngModel)]=\"producto.Ibu\" name=\"ibu\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Volumen: </label>                    \n                    <input [(ngModel)]=\"producto.Volumen\" name=\"volumen\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Stock: </label>                    \n                    <input [(ngModel)]=\"producto.Stock\" name=\"stock\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Estado: </label>                    \n                    <input [(ngModel)]=\"producto.Estado\" name=\"estado\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Procedencia: </label>                    \n                    <input [(ngModel)]=\"producto.Procedencia\" name=\"procedencia\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Categoria: </label>                    \n                    <input [(ngModel)]=\"producto.Categoria\" name=\"categoria\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">Marca: </label>                    \n                    <input [(ngModel)]=\"producto.Marca\" name=\"marca\" type=\"text\" class=\"form-control\">\n                </div>\n                <div class=\"form-group\">\n                    <label for=\"\">FechaRegistro: </label>                    \n                    <input [(ngModel)]=\"producto.FechaRegistro\" name=\"fechaRegistro\" type=\"text\" class=\"form-control\">\n                </div>\n                <button (click)=\"Actualizar(producto)\" class=\"btn btn-danger\">Actualizar</button>\n            </form>                        \n        </div>\n    </div>\n</div>\n"

/***/ }),

/***/ "./src/app/Producto/editar/editar.component.ts":
/*!*****************************************************!*\
  !*** ./src/app/Producto/editar/editar.component.ts ***!
  \*****************************************************/
/*! exports provided: EditarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "EditarComponent", function() { return EditarComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var src_app_Modelo_Producto__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! src/app/Modelo/Producto */ "./src/app/Modelo/Producto.ts");
/* harmony import */ var src_app_Service_service_service__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! src/app/Service/service.service */ "./src/app/Service/service.service.ts");





var EditarComponent = /** @class */ (function () {
    function EditarComponent(
    // private formBuilder: FormBuilder   ,
    router, service) {
        this.router = router;
        this.service = service;
        //public form: FormGroup  
        this.producto = new src_app_Modelo_Producto__WEBPACK_IMPORTED_MODULE_3__["Producto"]();
        /*this.form = this.formBuilder.group({
          codigo: 0,
          Nombre: '',//['', Validators.required],
          Descripcion: '',// ['', Validators.required],
          Marca: ''// ['', Validators.required]
        })*/
    }
    EditarComponent.prototype.ngOnInit = function () {
        this.Editar();
    };
    EditarComponent.prototype.Editar = function () {
        var _this = this;
        debugger;
        var codigo = localStorage.getItem("Codigo");
        this.service.getProductoId(+codigo)
            .subscribe(function (data) {
            _this.producto.idProducto = data[0].idProducto;
            _this.producto.nombre = data[0].nombre;
            _this.producto.descripcion = data[0].descripcion;
            _this.producto.imagen = data[0].imagen;
            _this.producto.presentacion = data[0].presentacion;
            _this.producto.precio = data[0].precio;
            _this.producto.contenido = data[0].contenido;
            _this.producto.ibu = data[0].ibu;
            _this.producto.volumen = data[0].volumen;
            _this.producto.stock = data[0].stock;
            _this.producto.estado = data[0].estado;
            _this.producto.procedencia = data[0].procedencia;
            _this.producto.categoria = data[0].categoria;
            _this.producto.marca = data[0].marca;
            _this.producto.fechaRegistro = data[0].fechaRegistro;
            //this.form.patchValue(data)
        });
    };
    EditarComponent.prototype.Actualizar = function (producto) {
        var _this = this;
        this.service.updateProducto(producto)
            .subscribe(function (data) {
            _this.producto = data;
            alert("Se Actualizo con Exito...!!!");
            _this.router.navigate(["listar"]);
        });
    };
    EditarComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-editar',
            template: __webpack_require__(/*! ./editar.component.html */ "./src/app/Producto/editar/editar.component.html"),
            styles: [__webpack_require__(/*! ./editar.component.css */ "./src/app/Producto/editar/editar.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"], src_app_Service_service_service__WEBPACK_IMPORTED_MODULE_4__["ServiceService"]])
    ], EditarComponent);
    return EditarComponent;
}());



/***/ }),

/***/ "./src/app/Producto/listar/listar.component.css":
/*!******************************************************!*\
  !*** ./src/app/Producto/listar/listar.component.css ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL1Byb2R1Y3RvL2xpc3Rhci9saXN0YXIuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/Producto/listar/listar.component.html":
/*!*******************************************************!*\
  !*** ./src/app/Producto/listar/listar.component.html ***!
  \*******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<div class=\"container\" >\n    <div class=\"card\" >\n        <div class=\"card-header\">\n            <h3>Producto</h3>\n        </div>\n        <div class=\"card-body\">\n            <table class=\"table table-hover\">\n                <thead>\n                    <tr>\n                        <th>IdProducto</th>\n                        <th>Nombre</th>\n                        <th>Descripcion</th>\n                        <th>Imagen</th>\n                        <th>Presentacion</th>\n                        <th>Precio</th>\n                        <th>Contenido</th>\n                        <th>Ibu</th>\n                        <th>Volumen</th>\n                        <th>Stock</th>\n                        <th>Estado</th>\n                        <th>Procedencia</th>\n                        <th>Categoria</th>\n                        <th>Marca</th>\n                        <th>FechaRegistro</th>\n                    </tr>\n                </thead>\n                <tbody>\n                    <tr *ngFor=\"let producto of producto\" class=\"text-center\">\n                        <td>{{producto.idProducto}}</td>\n                        <td>{{producto.nombre}}</td>\n                        <td>{{producto.descripcion}}</td>\n                        <td>{{producto.imagen}}</td>\n                        <td>{{producto.presentacion}}</td>\n                        <td>{{producto.precio}}</td>\n                        <td>{{producto.contenido}}</td>\n                        <td>{{producto.ibu}}</td>\n                        <td>{{producto.volumen}}</td>\n                        <td>{{producto.stock}}</td>\n                        <td>{{producto.estado}}</td>\n                        <td>{{producto.procedencia}}</td>\n                        <td>{{producto.categoria}}</td>\n                        <td>{{producto.marca}}</td>\n                        <td>{{producto.fechaRegistro}}</td>\n                        <td>\n                            <button (click)=\"Editar(producto)\" class=\"btn btn-warning\">Editar</button>\n                            <button (click)=\"Delete(producto)\" class=\"btn btn-danger\" style=\"margin-left: 10px;\">Eliminar</button>\n                          </td>\n                    </tr>\n                </tbody>\n            </table>\n        </div>\n    </div>\n</div>"

/***/ }),

/***/ "./src/app/Producto/listar/listar.component.ts":
/*!*****************************************************!*\
  !*** ./src/app/Producto/listar/listar.component.ts ***!
  \*****************************************************/
/*! exports provided: ListarComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ListarComponent", function() { return ListarComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var src_app_Service_service_service__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! src/app/Service/service.service */ "./src/app/Service/service.service.ts");




var ListarComponent = /** @class */ (function () {
    function ListarComponent(service, router) {
        this.service = service;
        this.router = router;
    }
    ListarComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.service.getProductos()
            .subscribe(function (data) {
            _this.producto = data;
        });
    };
    ListarComponent.prototype.Editar = function (producto) {
        localStorage.setItem("idProducto", producto.idProducto.toString());
        this.router.navigate(["editar"]);
    };
    ListarComponent.prototype.Delete = function (producto) {
        var _this = this;
        this.service.deleteProducto(producto)
            .subscribe(function (data) {
            _this.producto = _this.producto.filter(function (p) { return p !== producto; });
            alert("Usuario eliminado...");
        });
    };
    ListarComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-listar',
            template: __webpack_require__(/*! ./listar.component.html */ "./src/app/Producto/listar/listar.component.html"),
            styles: [__webpack_require__(/*! ./listar.component.css */ "./src/app/Producto/listar/listar.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [src_app_Service_service_service__WEBPACK_IMPORTED_MODULE_3__["ServiceService"], _angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], ListarComponent);
    return ListarComponent;
}());



/***/ }),

/***/ "./src/app/Service/service.service.ts":
/*!********************************************!*\
  !*** ./src/app/Service/service.service.ts ***!
  \********************************************/
/*! exports provided: ServiceService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ServiceService", function() { return ServiceService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");



var ServiceService = /** @class */ (function () {
    function ServiceService(http) {
        this.http = http;
        this.Url = 'satira/producto';
    }
    ServiceService.prototype.getProductos = function () {
        return this.http.get(this.Url);
    };
    ServiceService.prototype.createProducto = function (producto) {
        return this.http.post(this.Url, producto);
    };
    ServiceService.prototype.getProductoId = function (idProducto) {
        return this.http.get(this.Url + "/" + idProducto);
    };
    ServiceService.prototype.updateProducto = function (producto) {
        return this.http.put(this.Url + "/" + producto.idProducto, producto);
    };
    ServiceService.prototype.deleteProducto = function (producto) {
        return this.http.delete(this.Url + "/" + producto.idProducto);
    };
    ServiceService = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
            providedIn: 'root'
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_2__["HttpClient"]])
    ], ServiceService);
    return ServiceService;
}());



/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _Producto_agregar_agregar_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./Producto/agregar/agregar.component */ "./src/app/Producto/agregar/agregar.component.ts");
/* harmony import */ var _Producto_listar_listar_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./Producto/listar/listar.component */ "./src/app/Producto/listar/listar.component.ts");
/* harmony import */ var _Producto_editar_editar_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./Producto/editar/editar.component */ "./src/app/Producto/editar/editar.component.ts");






var routes = [
    { path: 'listar', component: _Producto_listar_listar_component__WEBPACK_IMPORTED_MODULE_4__["ListarComponent"] },
    { path: 'agregar', component: _Producto_agregar_agregar_component__WEBPACK_IMPORTED_MODULE_3__["AgregarComponent"] },
    { path: 'editar', component: _Producto_editar_editar_component__WEBPACK_IMPORTED_MODULE_5__["EditarComponent"] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n<div  style=\"text-align:center\">\n  <h1>\n    Bienvenido a {{ title }}!\n  </h1>\n  <h2>Cervezas Artezanales</h2>\n  <img width=\"130\" alt=\"Duff logo\" src=\"assets/images.png\" >\n</div>\n<br>\n<div class=\"container text-center\">\n  <button (click)=\"Listar()\" class=\"btn btn-info\">Listar</button>\n  <button (click)=\"Nuevo()\" class=\"btn btn-info\" style=\"margin-left: 10px;\">Nuevo</button> \n</div>\n<a href=\"\">Inicio</a>\n<hr>\n<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");



var AppComponent = /** @class */ (function () {
    function AppComponent(router) {
        this.router = router;
        this.title = 'Sátira';
    }
    AppComponent.prototype.Listar = function () {
        this.router.navigate(["listar"]);
    };
    AppComponent.prototype.Nuevo = function () {
        this.router.navigate(["agregar"]);
    };
    AppComponent = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        }),
        tslib__WEBPACK_IMPORTED_MODULE_0__["__metadata"]("design:paramtypes", [_angular_router__WEBPACK_IMPORTED_MODULE_2__["Router"]])
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "./node_modules/tslib/tslib.es6.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _Producto_listar_listar_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./Producto/listar/listar.component */ "./src/app/Producto/listar/listar.component.ts");
/* harmony import */ var _Producto_agregar_agregar_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./Producto/agregar/agregar.component */ "./src/app/Producto/agregar/agregar.component.ts");
/* harmony import */ var _Producto_editar_editar_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./Producto/editar/editar.component */ "./src/app/Producto/editar/editar.component.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _Service_service_service__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./Service/service.service */ "./src/app/Service/service.service.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");











var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"]([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"],
                _Producto_listar_listar_component__WEBPACK_IMPORTED_MODULE_5__["ListarComponent"],
                _Producto_agregar_agregar_component__WEBPACK_IMPORTED_MODULE_6__["AgregarComponent"],
                _Producto_editar_editar_component__WEBPACK_IMPORTED_MODULE_7__["EditarComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_2__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_3__["AppRoutingModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_8__["FormsModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_10__["HttpClientModule"]
            ],
            providers: [_Service_service_service__WEBPACK_IMPORTED_MODULE_9__["ServiceService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_4__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! /Users/julioramirez/Documents/Importante/WebSatir/src/main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map