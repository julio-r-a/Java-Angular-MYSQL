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

import idat.edu.pe.daa2.Entity.Cliente;
import idat.edu.pe.daa2.Service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {

	@Autowired
	ClienteService clienteService;
	
	
	@GetMapping
	public ResponseEntity<Object> buscartTodo() {

		List<Cliente> listaCliente = clienteService.buscarTodo();
		return new ResponseEntity<>(listaCliente, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") int idCliente) {
		Cliente cliente = clienteService.buscarPorID(idCliente);
		if (cliente == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Cliente no encontrado,id porporcionado no es correcto");
		return new ResponseEntity<Object>(cliente, HttpStatus.OK);

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> crear(@RequestBody Cliente cliente) {
		return new ResponseEntity<Object>(clienteService.crear(cliente), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> actualizar(@PathVariable("id") int idCliente, @RequestBody Cliente cliente) {
		clienteService.actualizar(cliente);
		return new ResponseEntity<Object>("Cliente actualizado correctamente", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{idCliente}")
	public ResponseEntity<Object> eliminar(@PathVariable("idCliente") int idCliente) {
		clienteService.eliminar(idCliente);
		return new ResponseEntity<Object>("Cliente eliminado correctamente", HttpStatus.OK);

	}	
}
