/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "entity3")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entity3.findAll", query = "SELECT e FROM Entity3 e"),
    @NamedQuery(name = "Entity3.findByProductID", query = "SELECT e FROM Entity3 e WHERE e.entity3PK.productID = :productID"),
    @NamedQuery(name = "Entity3.findByProductIndex", query = "SELECT e FROM Entity3 e WHERE e.entity3PK.productIndex = :productIndex"),
    @NamedQuery(name = "Entity3.findByImage", query = "SELECT e FROM Entity3 e WHERE e.image = :image")})
public class Entity3 implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Entity3PK entity3PK;
    @Column(name = "Image")
    private Integer image;

    public Entity3() {
    }

    public Entity3(Entity3PK entity3PK) {
        this.entity3PK = entity3PK;
    }

    public Entity3(int productID, int productIndex) {
        this.entity3PK = new Entity3PK(productID, productIndex);
    }

    public Entity3PK getEntity3PK() {
        return entity3PK;
    }

    public void setEntity3PK(Entity3PK entity3PK) {
        this.entity3PK = entity3PK;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entity3PK != null ? entity3PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entity3)) {
            return false;
        }
        Entity3 other = (Entity3) object;
        if ((this.entity3PK == null && other.entity3PK != null) || (this.entity3PK != null && !this.entity3PK.equals(other.entity3PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Entity3[ entity3PK=" + entity3PK + " ]";
    }
    
}
