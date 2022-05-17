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
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.idVenta = :idVenta")
    , @NamedQuery(name = "Venta.findByTotalProductos", query = "SELECT v FROM Venta v WHERE v.totalProductos = :totalProductos")
    , @NamedQuery(name = "Venta.findByMontoTotal", query = "SELECT v FROM Venta v WHERE v.montoTotal = :montoTotal")
    , @NamedQuery(name = "Venta.findByDireccion", query = "SELECT v FROM Venta v WHERE v.direccion = :direccion")
    , @NamedQuery(name = "Venta.findByFechaVenta", query = "SELECT v FROM Venta v WHERE v.fechaVenta = :fechaVenta")
   })
public class Venta implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVenta")
    private Integer idVenta;
    @Basic(optional = false)
    @Column(name = "totalProductos")
    private String totalProductos;
    @Column(name = "montoTotal")
    private String montoTotal;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "fechaVenta")
    private String fechaVenta;
    
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
	@ManyToOne(optional = false)
	private Cliente idcliente;
    
    public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public String getTotalProductos() {
		return totalProductos;
	}

	public void setTotalProductos(String totalProductos) {
		this.totalProductos = totalProductos;
	}

	public String getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(String montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Cliente getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Cliente idcliente) {
		this.idcliente = idcliente;
	}

	public MediodPago getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(MediodPago medioPago) {
		this.medioPago = medioPago;
	}


	@JoinColumn(name = "medioPago", referencedColumnName = "idMedioPago")
   	@ManyToOne(optional = false)
   	private MediodPago medioPago;

	public Venta() {
	
	}

	public Venta(Integer idVenta) {
		super();
		this.idVenta = idVenta;
	}

	public Venta(Integer idVenta, String totalProductos, String montoTotal, String direccion, String fechaVenta) {
		super();
		this.idVenta = idVenta;
		this.totalProductos = totalProductos;
		this.montoTotal = montoTotal;
		this.direccion = direccion;
		this.fechaVenta = fechaVenta;
	}
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "idat.edu.pe.daa2.Entity.Venta[ idVenta=" + idVenta + " ]";
    }


}
