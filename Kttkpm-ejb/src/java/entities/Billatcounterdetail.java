/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "billatcounterdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billatcounterdetail.findAll", query = "SELECT b FROM Billatcounterdetail b"),
    @NamedQuery(name = "Billatcounterdetail.findById", query = "SELECT b FROM Billatcounterdetail b WHERE b.id = :id"),
    @NamedQuery(name = "Billatcounterdetail.findByAmount", query = "SELECT b FROM Billatcounterdetail b WHERE b.amount = :amount"),
    @NamedQuery(name = "Billatcounterdetail.findByPrice", query = "SELECT b FROM Billatcounterdetail b WHERE b.price = :price")})
public class Billatcounterdetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private int amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private int price;
    @JoinColumn(name = "ProductID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Product productID;
    @JoinColumn(name = "BillAtCounterID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Billatcounter billAtCounterID;

    public Billatcounterdetail() {
    }

    public Billatcounterdetail(Integer id) {
        this.id = id;
    }

    public Billatcounterdetail(Integer id, int amount, int price) {
        this.id = id;
        this.amount = amount;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
    }

    public Billatcounter getBillAtCounterID() {
        return billAtCounterID;
    }

    public void setBillAtCounterID(Billatcounter billAtCounterID) {
        this.billAtCounterID = billAtCounterID;
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
        if (!(object instanceof Billatcounterdetail)) {
            return false;
        }
        Billatcounterdetail other = (Billatcounterdetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Billatcounterdetail[ id=" + id + " ]";
    }
    
}
