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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "electronicaldevice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Electronicaldevice.findAll", query = "SELECT e FROM Electronicaldevice e"),
    @NamedQuery(name = "Electronicaldevice.findByCode", query = "SELECT e FROM Electronicaldevice e WHERE e.code = :code"),
    @NamedQuery(name = "Electronicaldevice.findByGurantee", query = "SELECT e FROM Electronicaldevice e WHERE e.gurantee = :gurantee"),
    @NamedQuery(name = "Electronicaldevice.findByOrigin", query = "SELECT e FROM Electronicaldevice e WHERE e.origin = :origin"),
    @NamedQuery(name = "Electronicaldevice.findByDes", query = "SELECT e FROM Electronicaldevice e WHERE e.des = :des"),
    @NamedQuery(name = "Electronicaldevice.findByCate", query = "SELECT e FROM Electronicaldevice e WHERE e.cate = :cate"),
    @NamedQuery(name = "Electronicaldevice.findByProductID", query = "SELECT e FROM Electronicaldevice e WHERE e.productID = :productID")})
public class Electronicaldevice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gurantee")
    private int gurantee;
    @Size(max = 255)
    @Column(name = "Origin")
    private String origin;
    @Size(max = 255)
    @Column(name = "Des")
    private String des;
    @Column(name = "Cate")
    private Integer cate;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private Integer productID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;
    @JoinColumn(name = "CategoryElectronicID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Categoryelectronic categoryElectronicID;
    @JoinColumn(name = "BrandElectricID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Brandelectric brandElectricID;

    public Electronicaldevice() {
    }

    public Electronicaldevice(Integer productID) {
        this.productID = productID;
    }

    public Electronicaldevice(Integer productID, int gurantee) {
        this.productID = productID;
        this.gurantee = gurantee;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getGurantee() {
        return gurantee;
    }

    public void setGurantee(int gurantee) {
        this.gurantee = gurantee;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getCate() {
        return cate;
    }

    public void setCate(Integer cate) {
        this.cate = cate;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Categoryelectronic getCategoryElectronicID() {
        return categoryElectronicID;
    }

    public void setCategoryElectronicID(Categoryelectronic categoryElectronicID) {
        this.categoryElectronicID = categoryElectronicID;
    }

    public Brandelectric getBrandElectricID() {
        return brandElectricID;
    }

    public void setBrandElectricID(Brandelectric brandElectricID) {
        this.brandElectricID = brandElectricID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Electronicaldevice)) {
            return false;
        }
        Electronicaldevice other = (Electronicaldevice) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Electronicaldevice[ productID=" + productID + " ]";
    }
    
}
