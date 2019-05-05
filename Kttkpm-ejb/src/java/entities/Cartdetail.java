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
@Table(name = "cartdetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartdetail.findAll", query = "SELECT c FROM Cartdetail c"),
    @NamedQuery(name = "Cartdetail.findById", query = "SELECT c FROM Cartdetail c WHERE c.id = :id"),
    @NamedQuery(name = "Cartdetail.findByAmount", query = "SELECT c FROM Cartdetail c WHERE c.amount = :amount"),
    @NamedQuery(name = "Cartdetail.findByPrice", query = "SELECT c FROM Cartdetail c WHERE c.price = :price")})
public class Cartdetail implements Serializable {
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
    @JoinColumn(name = "CartID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cart cartID;

    public Cartdetail() {
    }

    public Cartdetail(Integer id) {
        this.id = id;
    }

    public Cartdetail(Integer id, int amount, int price) {
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

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
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
        if (!(object instanceof Cartdetail)) {
            return false;
        }
        Cartdetail other = (Cartdetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cartdetail[ id=" + id + " ]";
    }
    
}
