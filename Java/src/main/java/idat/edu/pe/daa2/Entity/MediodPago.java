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
@Table(name="medioPago")
@XmlRootElement
@NamedQueries ({
     @NamedQuery(name ="MediodPago.findAll", query = "SELECT mp FROM MediodPago mp" )
     , @NamedQuery(name = "MediodPago.findByIdMedioPago", query = "SELECT mp FROM MediodPago mp WHERE mp.idMedioPago = :idMedioPago")
     , @NamedQuery(name = "MediodPago.findByNombre", query = "SELECT mp FROM MediodPago mp WHERE mp.nombre = :nombre")
  })
public class MediodPago implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idMedioPago")
	private Integer idMedioPago;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "medioPago")
	@JsonBackReference(value="medioPago_venta")
	private List<Venta> ventaList;

	public Integer getIdMedioPago() {
		return idMedioPago;
	}

	public void setIdMedioPago(Integer idMedioPago) {
		this.idMedioPago = idMedioPago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlTransient
	public List<Venta> getVentaList() {
		return ventaList;
	}

	public void setVentaList(List<Venta> ventaList) {
		this.ventaList = ventaList;
	}

	public MediodPago() {
		super();
		
	}

	public MediodPago(Integer idMedioPago) {
		super();
		this.idMedioPago = idMedioPago;
	}

	public MediodPago(Integer idMedioPago, String nombre) {
		super();
		this.idMedioPago = idMedioPago;
		this.nombre = nombre;
	}
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedioPago != null ? idMedioPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MediodPago)) {
            return false;
        }
        MediodPago other = (MediodPago) object;
        if ((this.idMedioPago == null && other.idMedioPago != null) || (this.idMedioPago != null && !this.idMedioPago.equals(other.idMedioPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "idat.edu.pe.daa2.Entity.MediodPago[ idMedioPago=" + idMedioPago + " ]";
    }

	public MediodPago buscarPorID(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
