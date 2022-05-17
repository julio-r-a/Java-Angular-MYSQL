package idat.edu.pe.daa2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import idat.edu.pe.daa2.Entity.Producto;

public interface ProductoDao  extends JpaRepository<Producto, Integer> {

}
