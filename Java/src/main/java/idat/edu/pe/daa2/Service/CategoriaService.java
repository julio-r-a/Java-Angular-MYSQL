package idat.edu.pe.daa2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.Dao.CategoriaDao;
import idat.edu.pe.daa2.Entity.Categoria;

@Service
@Transactional
public class CategoriaService {
	@Autowired
	private CategoriaDao categoriaDao;
	
	public List<Categoria> buscarTodo() {
		return (ArrayList<Categoria>) categoriaDao.findAll();
	}

	public Categoria crear(Categoria categoria) {
		return categoriaDao.save(categoria);
	}
	
public Categoria actualizar (Categoria categoriaActualizar) {
		
	Categoria categoriaActual = categoriaDao.findById(categoriaActualizar.getIdCategoria()).get();
		
	categoriaActual.setIdCategoria(categoriaActualizar.getIdCategoria());
	categoriaActual.setNombreCategoria(categoriaActualizar.getNombreCategoria());
	categoriaActual.setDescripcionCategoria(categoriaActualizar.getDescripcionCategoria());
	categoriaActual.setFechaRegistro(categoriaActualizar.getFechaRegistro());

		Categoria categoriaActualizado = categoriaDao.save(categoriaActual);
		
		return categoriaActualizado;
		
	}
	
	public Categoria buscarPorID(Integer idCategoria) {
		return categoriaDao.findById(idCategoria).get();

	}
	
	public void actualizar ( int idCategoria, Categoria categoria) {
		Categoria categoriaActual = categoriaDao.findById(categoria.getIdCategoria()).get();
		
		categoriaActual.setIdCategoria(categoria.getIdCategoria());
		categoriaActual.setNombreCategoria(categoria.getNombreCategoria());
		categoriaActual.setDescripcionCategoria(categoria.getDescripcionCategoria());
		categoriaActual.setFechaRegistro(categoria.getFechaRegistro());
		categoriaDao.save(categoriaActual);

	}

	
	
	public  void  eliminar(Integer idCategoria) {
		
			categoriaDao.deleteById(idCategoria);
	}		
		
}
