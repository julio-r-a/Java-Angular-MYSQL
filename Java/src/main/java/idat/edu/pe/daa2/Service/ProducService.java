package idat.edu.pe.daa2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.Dao.ProducDao;
import idat.edu.pe.daa2.Entity.Marca;
import idat.edu.pe.daa2.Entity.Produc;
import idat.edu.pe.daa2.Entity.Producto;

@Service
@Transactional
public class ProducService {
	
	@Autowired
	private ProducDao producDao;
	
	public List<Produc> buscarTodo() {
		return (ArrayList<Produc>) producDao.findAll();
	}

	public Produc crear(Produc produc) {
		return producDao.save(produc);
	}

	public Produc actualizar (Produc producActualizar) {
		
		Produc producActual = producDao.findById(producActualizar.getIdProducto()).get();
			
		producActual.setIdProducto(producActualizar.getIdProducto());
		producActual.setNombre(producActualizar.getNombre());
		producActual.setDescripcion(producActualizar.getDescripcion());
		producActual.setPresentacion(producActualizar.getPresentacion());
		producActual.setPrecio(producActualizar.getPrecio());
		producActual.setContenido(producActualizar.getContenido());
		producActual.setIbu(producActualizar.getIbu());
		producActual.setVolumen(producActualizar.getVolumen());
		producActual.setStock(producActualizar.getStock());
		producActual.setEstado(producActualizar.getEstado());
		producActual.setProcedencia(producActualizar.getProcedencia());
		producActual.setCategoria(producActualizar.getCategoria());
		producActual.setMarca(producActualizar.getMarca());

		Produc producActualizado = producDao.save(producActual);
			
			return producActualizado;
			
		}
	public Produc buscarPorID(Integer idProducto) {
		return producDao.findById(idProducto).get();

	}
	
	public  void  eliminar(Integer id) {
		
		producDao.deleteById(id);
}		
	
public void actualizar ( int id, Produc produc) {
	Produc productoActual = producDao.findById(id).get();
	productoActual.setNombre(produc.getNombre());
	productoActual.setDescripcion(produc.getDescripcion());
	productoActual.setPresentacion(produc.getPresentacion());
	productoActual.setPrecio(produc.getPrecio());
	productoActual.setContenido(produc.getContenido());
	productoActual.setIbu(produc.getIbu());
	productoActual.setVolumen(produc.getVolumen());
	productoActual.setStock(produc.getStock());
	productoActual.setEstado(produc.getEstado());
	productoActual.setProcedencia(produc.getProcedencia());
	productoActual.setCategoria(produc.getCategoria());
	productoActual.setMarca(produc.getMarca());
	producDao.save(productoActual);

}

}


