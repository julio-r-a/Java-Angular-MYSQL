package idat.edu.pe.daa2.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import idat.edu.pe.daa2.Entity.Venta;
import idat.edu.pe.daa2.Service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaRestController {
	@Autowired
	VentaService ventaService;
	
	@GetMapping
	public ResponseEntity<Object> buscartTodo() {

		List<Venta> listaVenta = ventaService.buscarTodo();
		return new ResponseEntity<>(listaVenta, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") int idVenta) {
		Venta venta = ventaService.buscarPorID(idVenta);
		if (venta == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Venta no encontrada,id porporcionado no es correcto");
		return new ResponseEntity<Object>(venta, HttpStatus.OK);

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> crear(@RequestBody Venta venta) {
		ventaService.crear(venta);
		return new ResponseEntity<Object>("Venta creada correctamente", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> actualizar(@PathVariable("id") int idVenta, @RequestBody Venta venta) {
		ventaService.actualizar(venta);
		return new ResponseEntity<Object>("Venta actualizada correctamente", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") int idVenta) {
		ventaService.eliminar(idVenta);
		return new ResponseEntity<Object>("Venta eliminada correctamente", HttpStatus.OK);

	}
}
