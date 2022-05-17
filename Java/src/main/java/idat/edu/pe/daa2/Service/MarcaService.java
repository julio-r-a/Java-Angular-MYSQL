package idat.edu.pe.daa2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.Dao.MarcaDao;
import idat.edu.pe.daa2.Entity.Marca;


@Service
@Transactional
public class MarcaService {
	@Autowired
	private MarcaDao marcaDao;
	
	public List<Marca> buscarTodo() {
		return (ArrayList<Marca>) marcaDao.findAll();
	}

	public Marca crear(Marca marca) {
		return marcaDao.save(marca);
	}
	
public Marca actualizar (Marca marcaActualizar) {
		
	Marca marcaActual = marcaDao.findById(marcaActualizar.getIdMarca()).get();
		
	marcaActual.setIdMarca(marcaActualizar.getIdMarca());
	marcaActual.setNombre(marcaActualizar.getNombre());
	marcaActual.setFechaRegistro(marcaActualizar.getFechaRegistro());

	Marca marcaActualizado = marcaDao.save(marcaActual);
		
		return marcaActualizado;
		
	}
	
	public Marca buscarPorID(Integer idMarca) {
		return marcaDao.findById(idMarca).get();

	}
	
	public void actualizar ( int idMarca, Marca marca) {
		Marca marcaActual = marcaDao.findById(marca.getIdMarca()).get();
		
		marcaActual.setIdMarca(marca.getIdMarca());
		marcaActual.setNombre(marca.getNombre());
		marcaActual.setFechaRegistro(marca.getFechaRegistro());
		marcaDao.save(marcaActual);

	}

	
	
	public  void  eliminar(Integer idMarca) {
		
			marcaDao.deleteById(idMarca);
	}		
		

}
