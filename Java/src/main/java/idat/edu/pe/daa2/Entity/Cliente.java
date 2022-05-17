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
@Table(name="cliente")
@XmlRootElement
@NamedQueries ({
     @NamedQuery(name ="Cliente.findAll", query = "SELECT cl FROM Cliente cl" )
     , @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT cl FROM Cliente cl WHERE cl.idCliente = :idCliente")
     , @NamedQuery(name = "Cliente.findByNombres", query = "SELECT cl FROM Cliente cl WHERE cl.nombres = :nombres")
     , @NamedQuery(name = "Cliente.findByApellidos", query = "SELECT cl FROM Cliente cl WHERE cl.apellidos = :apellidos")
     , @NamedQuery(name = "Cliente.findByCelular", query = "SELECT cl FROM Cliente cl WHERE cl.celular = :celular")
     , @NamedQuery(name = "Cliente.findByCorreo", query = "SELECT cl FROM Cliente cl WHERE cl.correo = :correo")
     , @NamedQuery(name = "Cliente.findByClave", query = "SELECT cl FROM Cliente cl WHERE cl.clave = :clave")
    
})
public class Cliente implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idCliente")
	private Integer idCliente;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "celular")
	private String celular;
	@Column(name = "correo")
	private String correo;
	@Column(name = "clave")
	private String clave;

	
	

	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "idcliente")
	@JsonBackReference(value="cliente_venta")
	private List<Venta> ventaList;
	
	public Cliente() {
		
	}

	
	public Cliente(Integer idCliente, String nombres, String apellidos, String celular, String correo, String clave) {
		super();
		this.idCliente = idCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.celular = celular;
		this.correo = correo;
		this.clave = clave;
	}

	public Cliente(Integer idCliente) {
		super();
		this.idCliente = idCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	@XmlTransient
	public List<Venta> getVentaList() {
		return ventaList;
	}

	public void setVentaList(List<Venta> ventaList) {
		this.ventaList = ventaList;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idat.edu.pe.daa2.Entity.Cliente[ idCliente=" + idCliente + " ]";
    }

	public Cliente buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
