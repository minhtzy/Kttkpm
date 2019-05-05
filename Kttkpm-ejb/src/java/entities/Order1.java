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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order1.findAll", query = "SELECT o FROM Order1 o"),
    @NamedQuery(name = "Order1.findById", query = "SELECT o FROM Order1 o WHERE o.id = :id"),
    @NamedQuery(name = "Order1.findByCreatedat", query = "SELECT o FROM Order1 o WHERE o.createdat = :createdat"),
    @NamedQuery(name = "Order1.findByNote", query = "SELECT o FROM Order1 o WHERE o.note = :note")})
public class Order1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Created_at")
    private Integer createdat;
    @Size(max = 255)
    @Column(name = "Note")
    private String note;
    @JoinColumn(name = "CustomerID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Customer customerID;
    @JoinColumn(name = "ShipmentID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Shipment shipmentID;
    @JoinColumn(name = "CartID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cart cartID;
    @JoinColumn(name = "PaymentID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Payment paymentID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderID")
    private List<Billonline> billonlineList;

    public Order1() {
    }

    public Order1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Integer createdat) {
        this.createdat = createdat;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public Shipment getShipmentID() {
        return shipmentID;
    }

    public void setShipmentID(Shipment shipmentID) {
        this.shipmentID = shipmentID;
    }

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
    }

    public Payment getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Payment paymentID) {
        this.paymentID = paymentID;
    }

    @XmlTransient
    public List<Billonline> getBillonlineList() {
        return billonlineList;
    }

    public void setBillonlineList(List<Billonline> billonlineList) {
        this.billonlineList = billonlineList;
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
        if (!(object instanceof Order1)) {
            return false;
        }
        Order1 other = (Order1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Order1[ id=" + id + " ]";
    }
    
}
