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

import idat.edu.pe.daa2.Entity.Categoria;
import idat.edu.pe.daa2.Service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {
	@Autowired
	CategoriaService categoriaService;
	
	
	@GetMapping
	public ResponseEntity<Object> buscartTodo() {

		List<Categoria> listaCategoria = categoriaService.buscarTodo();
		return new ResponseEntity<>(listaCategoria, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") int id) {
		Categoria categoria = categoriaService.buscarPorID(id);
		if (categoria == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"categoria no encontrado,id porporcionado no es correcto");
		return new ResponseEntity<Object>(categoria, HttpStatus.OK);

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> crear(@RequestBody Categoria categoria) {		
		return new ResponseEntity<Object>(categoriaService.crear(categoria), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> actualizar(@PathVariable("id") int idCategoria, @RequestBody Categoria categoria) {
	
		return new ResponseEntity<Object>(categoriaService.actualizar(categoria), HttpStatus.OK);
	}

	@DeleteMapping(value = "/{idCategoria}")
	public ResponseEntity<Object> borrar(@PathVariable("idCategoria") int idCategoria) {
		categoriaService.eliminar(idCategoria);
		return new ResponseEntity<Object>("Categoria eliminado correctamente", HttpStatus.OK);

	}	
}


