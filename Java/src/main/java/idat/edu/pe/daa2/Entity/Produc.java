package idat.edu.pe.daa2.Entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="produc")
@XmlRootElement
@NamedQueries ({
    @NamedQuery(name ="Produc.findAll", query = "SELECT p FROM Produc p" )
    , @NamedQuery(name = "Produc.findByIdProducto", query = "SELECT p FROM Produc p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Produc.findByNombre", query = "SELECT p FROM Produc p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Produc.findByDescripcion", query = "SELECT p FROM Produc p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Produc.findByPresentacion", query = "SELECT p FROM Produc p WHERE p.presentacion = :presentacion")
    , @NamedQuery(name = "Produc.findByPrecio", query = "SELECT p FROM Produc p WHERE p.precio = :precio")
    , @NamedQuery(name = "Produc.findByContenido", query = "SELECT p FROM Produc p WHERE p.contenido = :contenido")
    , @NamedQuery(name = "Produc.findByIbu", query = "SELECT p FROM Produc p WHERE p.ibu = :ibu")
    , @NamedQuery(name = "Produc.findByVolumen", query = "SELECT p FROM Produc p WHERE p.volumen = :volumen")
    , @NamedQuery(name = "Produc.findByStock", query = "SELECT p FROM Produc p WHERE p.stock = :stock")
    , @NamedQuery(name = "Produc.findByEstado", query = "SELECT p FROM Produc p WHERE p.estado = :estado")
    , @NamedQuery(name = "Produc.findByProcedencia", query = "SELECT p FROM Producto p WHERE p.procedencia = :procedencia")
    , @NamedQuery(name = "Produc.findByCategoria", query = "SELECT p FROM Producto p WHERE p.categoria = :categoria")
    , @NamedQuery(name = "Produc.findByMarca", query = "SELECT p FROM Producto p WHERE p.marca = :marca")
})
public class Produc implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idProducto")
	private Integer idProducto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="descripcion")	
	private String descripcion;
	@Column(name="presentacion")	
	private String presentacion;
	@Column(name="precio")	
	private Double precio;
	@Column(name="contenido")	
	private String contenido;
	@Column(name="ibu")
	private String ibu;
	@Column(name="volumen")	
	private String volumen;
	@Column(name="stock")
	private Integer stock;
	@Column(name="estado")	
	private String estado;
	@Column(name="procedencia")	
	private String procedencia;
	@Column(name="categoria")	
	private String categoria;
	@Column(name="marca")	
	private String marca;
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getIbu() {
		return ibu;
	}
	public void setIbu(String ibu) {
		this.ibu = ibu;
	}
	public String getVolumen() {
		return volumen;
	}
	public void setVolumen(String volumen) {
		this.volumen = volumen;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Produc(Integer idProducto, String nombre, String descripcion, String presentacion, String imagen,
			Double precio, String contenido, String ibu, String volumen, Integer stock, String estado,
			String procedencia, String categoria, String marca) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.precio = precio;
		this.contenido = contenido;
		this.ibu = ibu;
		this.volumen = volumen;
		this.stock = stock;
		this.estado = estado;
		this.procedencia = procedencia;
		this.categoria = categoria;
		this.marca = marca;
	}
	public Produc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produc)) {
            return false;
        }
        Produc other = (Produc) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idat.edu.pe.daa2.Entity.Cliente[ idCliente=" + idProducto + " ]";
    }

	public Cliente buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
