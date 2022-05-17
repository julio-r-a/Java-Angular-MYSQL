package idat.edu.pe.daa2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import idat.edu.pe.daa2.Dao.CategoriaDao;
import idat.edu.pe.daa2.Dao.MediodPagoDao;
import idat.edu.pe.daa2.Entity.Categoria;
import idat.edu.pe.daa2.Entity.MediodPago;

@Service
@Transactional
public class MediodPagoService {
	@Autowired
	private MediodPagoDao mediodPagoDao;
	
	public List<MediodPago> buscarTodo() {
		return (ArrayList<MediodPago>) mediodPagoDao.findAll();
	}

	public MediodPago crear(MediodPago mediodPago) {
		return mediodPagoDao.save(mediodPago);
	}
	
public MediodPago actualizar (MediodPago mediodPagoActualizar) {
		
	MediodPago mediodPagoActual = mediodPagoDao.findById(mediodPagoActualizar.getIdMedioPago()).get();
		
	mediodPagoActual.setIdMedioPago(mediodPagoActualizar.getIdMedioPago());
	mediodPagoActual.setNombre(mediodPagoActualizar.getNombre());

	MediodPago mediodPagoActualizado = mediodPagoDao.save(mediodPagoActual);
		
		return mediodPagoActualizado;
		
	}
	
	public MediodPago buscarPorID(Integer idMedioPago) {
		return mediodPagoDao.findById(idMedioPago).get();

	}
	
	public void actualizar ( int idMedioPago, MediodPago mediodPago) {
		MediodPago mediodPagoActual = mediodPagoDao.findById(mediodPago.getIdMedioPago()).get();
		
		mediodPagoActual.setIdMedioPago(mediodPago.getIdMedioPago());
		mediodPagoActual.setNombre(mediodPago.getNombre());
		mediodPagoDao.save(mediodPagoActual);

	}

	
	
	public  void  eliminar(Integer idMedioPago) {
		
		mediodPagoDao.deleteById(idMedioPago);
	}		
		
}
