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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "membercard")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Membercard.findAll", query = "SELECT m FROM Membercard m"),
    @NamedQuery(name = "Membercard.findById", query = "SELECT m FROM Membercard m WHERE m.id = :id"),
    @NamedQuery(name = "Membercard.findByCode", query = "SELECT m FROM Membercard m WHERE m.code = :code"),
    @NamedQuery(name = "Membercard.findByCoin", query = "SELECT m FROM Membercard m WHERE m.coin = :coin"),
    @NamedQuery(name = "Membercard.findByType", query = "SELECT m FROM Membercard m WHERE m.type = :type"),
    @NamedQuery(name = "Membercard.findByConsumer", query = "SELECT m FROM Membercard m WHERE m.consumer = :consumer")})
public class Membercard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Coin")
    private int coin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Consumer")
    private int consumer;
    @JoinColumn(name = "CustomerID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Customer customerID;

    public Membercard() {
    }

    public Membercard(Integer id) {
        this.id = id;
    }

    public Membercard(Integer id, int coin, int type, int consumer) {
        this.id = id;
        this.coin = coin;
        this.type = type;
        this.consumer = consumer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getConsumer() {
        return consumer;
    }

    public void setConsumer(int consumer) {
        this.consumer = consumer;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
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
        if (!(object instanceof Membercard)) {
            return false;
        }
        Membercard other = (Membercard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Membercard[ id=" + id + " ]";
    }
    
}
