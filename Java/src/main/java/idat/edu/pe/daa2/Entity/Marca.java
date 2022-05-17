package idat.edu.pe.daa2.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="marca")
@XmlRootElement
@NamedQueries ({
     @NamedQuery(name ="Marca.findAll", query = "SELECT m FROM Marca m" )
     , @NamedQuery(name = "Marca.findByIdMarca", query = "SELECT m FROM Marca m WHERE m.idMarca = :idMarca")
     , @NamedQuery(name = "Marca.findByNombre", query = "SELECT m FROM Marca m WHERE m.nombre = :nombre")
     ,@NamedQuery(name = "Marca.findByFechaRegistro", query = "SELECT m FROM Marca m WHERE m.fechaRegistro = :fechaRegistro")
})
public class Marca implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idMarca")
	private Integer idMarca;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "fechaRegistro")
	private String fechaRegistro;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "marca")
	@JsonBackReference(value="marca_producto")
	private List<Producto> productoList;

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	@XmlTransient
	public List<Producto> getProductoList() {
		return productoList;
	}

	public void setProductoList(List<Producto> productoList) {
		this.productoList = productoList;
	}

	public Marca() {
		super();
		
	}

	public Marca(Integer idMarca) {
		super();
		this.idMarca = idMarca;
	}

	public Marca(Integer idMarca, String nombre, String fechaRegistro) {
		super();
		this.idMarca = idMarca;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
	}
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idMarca != null ? idMarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.idMarca == null && other.idMarca != null) || (this.idMarca != null && !this.idMarca.equals(other.idMarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idat.edu.pe.daa2.Entity.Marca[ idMarca=" + idMarca + " ]";
    }

	public Marca buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
