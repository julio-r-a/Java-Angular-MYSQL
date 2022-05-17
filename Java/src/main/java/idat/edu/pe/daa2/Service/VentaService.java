package idat.edu.pe.daa2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.Dao.VentaDao;
import idat.edu.pe.daa2.Entity.Venta;

@Service
@Transactional
public class VentaService {
	@Autowired
	private VentaDao ventaDao;
	
	public VentaService() {
		
	}
	
	public List<Venta> buscarTodo() {
		return (ArrayList<Venta>) ventaDao.findAll();
	}

	public Venta crear(Venta venta) {
		return ventaDao.save(venta);
	}
	
public Venta actualizar (Venta ventaActualizar) {
	Venta ventaActual = ventaDao.findById(ventaActualizar.getIdVenta()).get();
	
	ventaActual.setIdVenta(ventaActualizar.getIdVenta());
	ventaActual.setTotalProductos(ventaActualizar.getTotalProductos());
	ventaActual.setMontoTotal(ventaActualizar.getMontoTotal());
	ventaActual.setDireccion(ventaActualizar.getDireccion());
	ventaActual.setFechaVenta(ventaActualizar.getFechaVenta());

		Venta ventaActualizado = ventaDao.save(ventaActual);
		
		return ventaActualizado;
		
	}
	
	public Venta buscarPorID(Integer idVenta) {
		return ventaDao.findById(idVenta).get();

	}
	
	
	public  void  eliminar(Integer idVenta) {
		
			ventaDao.deleteById(idVenta);
	}		
		
	public void actualizar ( int idVenta, Venta venta) {
		Venta ventaActual = ventaDao.findById(idVenta).get();
		ventaActual.setTotalProductos(venta.getTotalProductos());
		ventaActual.setMontoTotal(venta.getMontoTotal());
		ventaActual.setDireccion(venta.getDireccion());
		ventaActual.setFechaVenta(venta.getFechaVenta());
		ventaActual.setIdcliente(venta.getIdcliente());
		ventaActual.setMedioPago(venta.getMedioPago());
		ventaDao.save(ventaActual);

	}
}
