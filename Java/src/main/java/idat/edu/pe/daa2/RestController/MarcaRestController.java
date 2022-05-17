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

import idat.edu.pe.daa2.Entity.Marca;
import idat.edu.pe.daa2.Service.MarcaService;

@RestController
@RequestMapping("/marca")
public class MarcaRestController {

	@Autowired
	MarcaService marcaService;
	
	
	@GetMapping
	public ResponseEntity<Object> buscartTodo() {

		List<Marca> listaMarca = marcaService.buscarTodo();
		return new ResponseEntity<>(listaMarca, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") int idMarca) {
		Marca marca = marcaService.buscarPorID(idMarca);
		if (marca == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Marca no encontrada,id porporcionado no es correcto");
		return new ResponseEntity<Object>(marca, HttpStatus.OK);

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> crear(@RequestBody Marca marca) {
		marcaService.crear(marca);
		return new ResponseEntity<Object>("Marca creada correctamente", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> actualizar(@PathVariable("id") int idMarca, @RequestBody Marca marca) {
		marcaService.actualizar(marca);
		return new ResponseEntity<Object>("Marca actualizado correctamente", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") int idMarca) {
		marcaService.eliminar(idMarca);
		return new ResponseEntity<Object>("Marca eliminada correctamente", HttpStatus.OK);

	}	
}

