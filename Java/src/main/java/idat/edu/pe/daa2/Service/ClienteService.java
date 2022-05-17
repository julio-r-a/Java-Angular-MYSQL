package idat.edu.pe.daa2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.Dao.ClienteDao;
import idat.edu.pe.daa2.Entity.Cliente;

@Service
@Transactional
public class ClienteService {
	
	@Autowired
	private ClienteDao clienteDao;
	
	public List<Cliente> buscarTodo() {
		return (ArrayList<Cliente>) clienteDao.findAll();
	}

	public Cliente crear(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
public Cliente actualizar (Cliente clienteActualizar) {
		
	Cliente clienteActual = clienteDao.findById(clienteActualizar.getIdCliente()).get();
		
	clienteActual.setIdCliente(clienteActualizar.getIdCliente());
	clienteActual.setNombres(clienteActualizar.getNombres());
	clienteActual.setApellidos(clienteActualizar.getApellidos());
	clienteActual.setCelular(clienteActualizar.getCelular());
	clienteActual.setCorreo(clienteActualizar.getCorreo());
	clienteActual.setClave(clienteActualizar.getClave());
		Cliente clienteActualizado = clienteDao.save(clienteActual);
		
		return clienteActualizado;
		
	}
	
	public Cliente buscarPorID(Integer idCliente) {
		return clienteDao.findById(idCliente).get();

	}
	
	public void actualizar ( int idCliente, Cliente cliente) {
		Cliente clienteActual = clienteDao.findById(cliente.getIdCliente()).get();
		
		
		clienteActual.setIdCliente(cliente.getIdCliente());
		clienteActual.setNombres(cliente.getNombres());
		clienteActual.setApellidos(cliente.getApellidos());
		clienteActual.setCelular(cliente.getCelular());
		clienteActual.setCorreo(cliente.getCorreo());
		clienteActual.setClave(cliente.getClave());
		clienteDao.save(clienteActual);

	}

	
	
	public  void  eliminar(Integer idCliente) {
		
			clienteDao.deleteById(idCliente);
	}		
}
