/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author minht
 */
@Embeddable
public class EntityPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductIndex")
    private int productIndex;

    public EntityPK() {
    }

    public EntityPK(int productID, int productIndex) {
        this.productID = productID;
        this.productIndex = productIndex;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductIndex() {
        return productIndex;
    }

    public void setProductIndex(int productIndex) {
        this.productIndex = productIndex;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productID;
        hash += (int) productIndex;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntityPK)) {
            return false;
        }
        EntityPK other = (EntityPK) object;
        if (this.productID != other.productID) {
            return false;
        }
        if (this.productIndex != other.productIndex) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.EntityPK[ productID=" + productID + ", productIndex=" + productIndex + " ]";
    }
    
}
