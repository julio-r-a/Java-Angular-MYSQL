package idat.edu.pe.daa2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.Dao.ProductoDao;
import idat.edu.pe.daa2.Entity.Producto;

@Service
@Transactional
public class ProductoService {

	@Autowired
	private ProductoDao productoDao;
	
	public ProductoService() {
		
	}
	
	public List<Producto> buscarTodo() {
		return (ArrayList<Producto>) productoDao.findAll();
	}

	public Producto crear(Producto producto) {
		return productoDao.save(producto);
	}
	
public Producto actualizar (Producto productoActualizar) {
		
	Producto productoActual = productoDao.findById(productoActualizar.getIdProducto()).get();
		
	productoActual.setIdProducto(productoActualizar.getIdProducto());
	productoActual.setNombre(productoActualizar.getNombre());
	productoActual.setDescripcion(productoActualizar.getDescripcion());
	productoActual.setImagen(productoActualizar.getImagen());
	productoActual.setPresentacion(productoActualizar.getPresentacion());
	productoActual.setPrecio(productoActualizar.getPrecio());
	productoActual.setContenido(productoActualizar.getContenido());
	productoActual.setIbu(productoActualizar.getIbu());
	productoActual.setVolumen(productoActualizar.getVolumen());
	productoActual.setStock(productoActualizar.getStock());
	productoActual.setEstado(productoActualizar.getEstado());
	productoActual.setProcedencia(productoActualizar.getProcedencia());

		Producto productoActualizado = productoDao.save(productoActual);
		
		return productoActualizado;
		
	}
	
	public Producto buscarPorID(Integer id) {
		return productoDao.findById(id).get();

	}
	
	
	public  void  eliminar(Integer id) {
		
			productoDao.deleteById(id);
	}		
		
	public void actualizar ( int id, Producto producto) {
		Producto productoActual = productoDao.findById(id).get();
		productoActual.setNombre(producto.getNombre());
		productoActual.setDescripcion(producto.getDescripcion());
		productoActual.setImagen(producto.getImagen());
		productoActual.setPresentacion(producto.getPresentacion());
		productoActual.setPrecio(producto.getPrecio());
		productoActual.setContenido(producto.getContenido());
		productoActual.setIbu(producto.getIbu());
		productoActual.setVolumen(producto.getVolumen());
		productoActual.setStock(producto.getStock());
		productoActual.setEstado(producto.getEstado());
		productoActual.setProcedencia(producto.getProcedencia());
		productoActual.setCategoria(producto.getCategoria());
		productoActual.setMarca(producto.getMarca());
		productoDao.save(productoActual);

	}

}
