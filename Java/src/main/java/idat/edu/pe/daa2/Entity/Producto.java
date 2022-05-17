package idat.edu.pe.daa2.Entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries ({
     @NamedQuery(name ="Producto.findAll", query = "SELECT p FROM Producto p" )
     , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
     , @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre")
     , @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion")
     , @NamedQuery(name = "Producto.findByImagen", query = "SELECT p FROM Producto p WHERE p.imagen = :imagen")
     , @NamedQuery(name = "Producto.findByPresentacion", query = "SELECT p FROM Producto p WHERE p.presentacion = :presentacion")
     , @NamedQuery(name = "Producto.findByPrecio", query = "SELECT p FROM Producto p WHERE p.precio = :precio")
     , @NamedQuery(name = "Producto.findByContenido", query = "SELECT p FROM Producto p WHERE p.contenido = :contenido")
     , @NamedQuery(name = "Producto.findByIbu", query = "SELECT p FROM Producto p WHERE p.ibu = :ibu")
     , @NamedQuery(name = "Producto.findByVolumen", query = "SELECT p FROM Producto p WHERE p.volumen = :volumen")
     , @NamedQuery(name = "Producto.findByStock", query = "SELECT p FROM Producto p WHERE p.stock = :stock")
     , @NamedQuery(name = "Producto.findByEstado", query = "SELECT p FROM Producto p WHERE p.estado = :estado")
     , @NamedQuery(name = "Producto.findByProcedencia", query = "SELECT p FROM Producto p WHERE p.procedencia = :procedencia")
     , @NamedQuery(name = "Producto.findByFechaRegistro", query = "SELECT p FROM Producto p WHERE p.fechaRegistro = :fechaRegistro")
    // , @NamedQuery(name = "Producto.findByIdCategoria", query = "SELECT p FROM Producto p WHERE p.idCategoria = :idCategoria")
})
public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idProducto")
	private Integer idProducto;
	
	private String nombre;
	private String descripcion;
	private String presentacion;
	private String imagen;
	private Double precio;
	private String contenido;
	private String ibu;
	private String volumen;
	private Integer stock;
	private String estado;
	private String procedencia;
	@JoinColumn(name = "categoria", referencedColumnName = "idCategoria")
	@ManyToOne(optional = false)
	private Categoria categoria;
	@JoinColumn(name = "marca", referencedColumnName = "idMarca")
	@ManyToOne(optional = false)
	private Marca marca;
	private String fechaRegistro;
	
	public Producto(Integer idProducto, String nombre, String descripcion, String presentacion, String imagen,
			Double precio, String contenido, String ibu, String volumen, Integer stock, String estado,
			String procedencia, String fechaRegistro) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.imagen = imagen;
		this.precio = precio;
		this.contenido = contenido;
		this.ibu = ibu;
		this.volumen = volumen;
		this.stock = stock;
		this.estado = estado;
		this.procedencia = procedencia;
		this.fechaRegistro = fechaRegistro;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
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
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Producto() {
		super();
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
	        if (!(object instanceof Producto)) {
	            return false;
	        }
	        Producto other = (Producto) object;
	        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "idat.edu.pe.daa2.Entity.Producto[ idProducto=" + idProducto + " ]";
	    }
	
}
