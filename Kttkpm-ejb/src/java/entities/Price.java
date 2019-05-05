/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "price")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Price.findAll", query = "SELECT p FROM Price p"),
    @NamedQuery(name = "Price.findById", query = "SELECT p FROM Price p WHERE p.id = :id"),
    @NamedQuery(name = "Price.findByPrice", query = "SELECT p FROM Price p WHERE p.price = :price"),
    @NamedQuery(name = "Price.findByStartdate", query = "SELECT p FROM Price p WHERE p.startdate = :startdate"),
    @NamedQuery(name = "Price.findByEnddate", query = "SELECT p FROM Price p WHERE p.enddate = :enddate")})
public class Price implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private int price;
    @Column(name = "Start_date")
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @Column(name = "End_date")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "priceID")
    private List<Product> productList;

    public Price() {
    }

    public Price(Integer id) {
        this.id = id;
    }

    public Price(Integer id, int price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
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
        if (!(object instanceof Price)) {
            return false;
        }
        Price other = (Price) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Price[ id=" + id + " ]";
    }
    
}
