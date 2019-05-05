/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minht
 */
@javax.persistence.Entity
@Table(name = "entity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entity.findAll", query = "SELECT e FROM Entity e"),
    @NamedQuery(name = "Entity.findByProductID", query = "SELECT e FROM Entity e WHERE e.entityPK.productID = :productID"),
    @NamedQuery(name = "Entity.findByProductIndex", query = "SELECT e FROM Entity e WHERE e.entityPK.productIndex = :productIndex")})
public class Entity implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EntityPK entityPK;

    public Entity() {
    }

    public Entity(EntityPK entityPK) {
        this.entityPK = entityPK;
    }

    public Entity(int productID, int productIndex) {
        this.entityPK = new EntityPK(productID, productIndex);
    }

    public EntityPK getEntityPK() {
        return entityPK;
    }

    public void setEntityPK(EntityPK entityPK) {
        this.entityPK = entityPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entityPK != null ? entityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entity)) {
            return false;
        }
        Entity other = (Entity) object;
        if ((this.entityPK == null && other.entityPK != null) || (this.entityPK != null && !this.entityPK.equals(other.entityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Entity[ entityPK=" + entityPK + " ]";
    }
    
}
