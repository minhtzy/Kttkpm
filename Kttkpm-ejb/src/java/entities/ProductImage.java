/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "product_image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductImage.findAll", query = "SELECT p FROM ProductImage p"),
    @NamedQuery(name = "ProductImage.findByProductID", query = "SELECT p FROM ProductImage p WHERE p.productImagePK.productID = :productID"),
    @NamedQuery(name = "ProductImage.findByProductIndex", query = "SELECT p FROM ProductImage p WHERE p.productImagePK.productIndex = :productIndex")})
public class ProductImage implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductImagePK productImagePK;

    public ProductImage() {
    }

    public ProductImage(ProductImagePK productImagePK) {
        this.productImagePK = productImagePK;
    }

    public ProductImage(int productID, int productIndex) {
        this.productImagePK = new ProductImagePK(productID, productIndex);
    }

    public ProductImagePK getProductImagePK() {
        return productImagePK;
    }

    public void setProductImagePK(ProductImagePK productImagePK) {
        this.productImagePK = productImagePK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productImagePK != null ? productImagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductImage)) {
            return false;
        }
        ProductImage other = (ProductImage) object;
        if ((this.productImagePK == null && other.productImagePK != null) || (this.productImagePK != null && !this.productImagePK.equals(other.productImagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProductImage[ productImagePK=" + productImagePK + " ]";
    }
    
}
