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
@Table(name = "clothes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clothes.findAll", query = "SELECT c FROM Clothes c"),
    @NamedQuery(name = "Clothes.findBySize", query = "SELECT c FROM Clothes c WHERE c.size = :size"),
    @NamedQuery(name = "Clothes.findByColot", query = "SELECT c FROM Clothes c WHERE c.colot = :colot"),
    @NamedQuery(name = "Clothes.findByGender", query = "SELECT c FROM Clothes c WHERE c.gender = :gender"),
    @NamedQuery(name = "Clothes.findByDes", query = "SELECT c FROM Clothes c WHERE c.des = :des"),
    @NamedQuery(name = "Clothes.findByProductID", query = "SELECT c FROM Clothes c WHERE c.productID = :productID")})
public class Clothes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Size")
    private int size;
    @Size(max = 255)
    @Column(name = "Colot")
    private String colot;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gender")
    private int gender;
    @Size(max = 255)
    @Column(name = "Des")
    private String des;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private Integer productID;
    @JoinColumn(name = "CategoryClothesID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Categoryclothes categoryClothesID;
    @JoinColumn(name = "BrandClothesID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Brandclothes brandClothesID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;

    public Clothes() {
    }

    public Clothes(Integer productID) {
        this.productID = productID;
    }

    public Clothes(Integer productID, int size, int gender) {
        this.productID = productID;
        this.size = size;
        this.gender = gender;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColot() {
        return colot;
    }

    public void setColot(String colot) {
        this.colot = colot;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Categoryclothes getCategoryClothesID() {
        return categoryClothesID;
    }

    public void setCategoryClothesID(Categoryclothes categoryClothesID) {
        this.categoryClothesID = categoryClothesID;
    }

    public Brandclothes getBrandClothesID() {
        return brandClothesID;
    }

    public void setBrandClothesID(Brandclothes brandClothesID) {
        this.brandClothesID = brandClothesID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        if (!(object instanceof Clothes)) {
            return false;
        }
        Clothes other = (Clothes) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Clothes[ productID=" + productID + " ]";
    }
    
}
