/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "shipment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shipment.findAll", query = "SELECT s FROM Shipment s"),
    @NamedQuery(name = "Shipment.findById", query = "SELECT s FROM Shipment s WHERE s.id = :id"),
    @NamedQuery(name = "Shipment.findByStartat", query = "SELECT s FROM Shipment s WHERE s.startat = :startat"),
    @NamedQuery(name = "Shipment.findByEndat", query = "SELECT s FROM Shipment s WHERE s.endat = :endat"),
    @NamedQuery(name = "Shipment.findByAddr", query = "SELECT s FROM Shipment s WHERE s.addr = :addr"),
    @NamedQuery(name = "Shipment.findByType", query = "SELECT s FROM Shipment s WHERE s.type = :type"),
    @NamedQuery(name = "Shipment.findByCost", query = "SELECT s FROM Shipment s WHERE s.cost = :cost"),
    @NamedQuery(name = "Shipment.findByDiscriminator", query = "SELECT s FROM Shipment s WHERE s.discriminator = :discriminator")})
public class Shipment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Start_at")
    private Integer startat;
    @Column(name = "End_at")
    private Integer endat;
    @Size(max = 255)
    @Column(name = "Addr")
    private String addr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cost")
    private int cost;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Discriminator")
    private String discriminator;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentID")
    private List<Order1> order1List;

    public Shipment() {
    }

    public Shipment(Integer id) {
        this.id = id;
    }

    public Shipment(Integer id, int type, int cost, String discriminator) {
        this.id = id;
        this.type = type;
        this.cost = cost;
        this.discriminator = discriminator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStartat() {
        return startat;
    }

    public void setStartat(Integer startat) {
        this.startat = startat;
    }

    public Integer getEndat() {
        return endat;
    }

    public void setEndat(Integer endat) {
        this.endat = endat;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @XmlTransient
    public List<Order1> getOrder1List() {
        return order1List;
    }

    public void setOrder1List(List<Order1> order1List) {
        this.order1List = order1List;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipment)) {
            return false;
        }
        Shipment other = (Shipment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Shipment[ id=" + id + " ]";
    }
    
}
