package idat.edu.pe.daa2.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import idat.edu.pe.daa2.Entity.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Integer>{

}
