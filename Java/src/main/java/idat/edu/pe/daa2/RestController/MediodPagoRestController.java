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

import idat.edu.pe.daa2.Entity.MediodPago;
import idat.edu.pe.daa2.Service.MediodPagoService;

@RestController
@RequestMapping("/mediodPago")
public class MediodPagoRestController {
	@Autowired
	MediodPagoService mediodPagoService;
	
	
	@GetMapping
	public ResponseEntity<Object> buscartTodo() {

		List<MediodPago> listaMedioPago = mediodPagoService.buscarTodo();
		return new ResponseEntity<>(listaMedioPago, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> buscarPorId(@PathVariable("id") int idMedioPago) {
		MediodPago mediodPago = mediodPagoService.buscarPorID(idMedioPago);
		if (mediodPago == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Medio de Pago no encontrado,id porporcionado no es correcto");
		return new ResponseEntity<Object>(mediodPago, HttpStatus.OK);

	}

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> crear(@RequestBody MediodPago mediodPago) {
		mediodPagoService.crear(mediodPago);
		return new ResponseEntity<Object>("Medio de Pago creado correctamente", HttpStatus.OK);
	}

	@PutMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Object> actualizar(@PathVariable("id") int idMedioPago, @RequestBody MediodPago mediodPago) {
		mediodPagoService.actualizar(mediodPago);
		return new ResponseEntity<Object>("Medio de Pago actualizado correctamente", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") int idMedioPago) {
		mediodPagoService.eliminar(idMedioPago);
		return new ResponseEntity<Object>("Medio de Pago eliminado correctamente", HttpStatus.OK);

	}	
}
