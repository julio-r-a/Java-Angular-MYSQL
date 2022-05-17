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

import idat.edu.pe.daa2.Entity.Produc;
import idat.edu.pe.daa2.Service.ProducService;

@RestController
@RequestMapping("/produc")
public class ProducRestController {
	
	@Autowired
	ProducService producService;
	
	@GetMapping
	public ResponseEntity<Object> buscartTodo() {

		List<Produc> listaProduc = producService.buscarTodo();
		return new ResponseEntity<>(listaProduc, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") int id) {
		Produc produc = producService.buscarPorID(id);
		if (produc == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Producto no encontrado,id porporcionado no es correcto");
		return new ResponseEntity<Object>(produc, HttpStatus.OK);
	}
	
	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> crear(@RequestBody Produc produc) {
		return new ResponseEntity<Object>(producService.crear(produc)
, HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> actualizar(@PathVariable("id") int id, @RequestBody Produc produc) {
		return new ResponseEntity<Object>(producService.actualizar(produc), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> borrar(@PathVariable("id") int id) {
		producService.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);

	}

}
