/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findById", query = "SELECT p FROM Payment p WHERE p.id = :id"),
    @NamedQuery(name = "Payment.findByType", query = "SELECT p FROM Payment p WHERE p.type = :type"),
    @NamedQuery(name = "Payment.findByOwner", query = "SELECT p FROM Payment p WHERE p.owner = :owner"),
    @NamedQuery(name = "Payment.findByATMType", query = "SELECT p FROM Payment p WHERE p.aTMType = :aTMType"),
    @NamedQuery(name = "Payment.findByBank", query = "SELECT p FROM Payment p WHERE p.bank = :bank"),
    @NamedQuery(name = "Payment.findByCardType", query = "SELECT p FROM Payment p WHERE p.cardType = :cardType"),
    @NamedQuery(name = "Payment.findByNumberCard", query = "SELECT p FROM Payment p WHERE p.numberCard = :numberCard"),
    @NamedQuery(name = "Payment.findByDiscriminator", query = "SELECT p FROM Payment p WHERE p.discriminator = :discriminator"),
    @NamedQuery(name = "Payment.findByOwner2", query = "SELECT p FROM Payment p WHERE p.owner2 = :owner2")})
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private int type;
    @Size(max = 255)
    @Column(name = "Owner")
    private String owner;
    @Size(max = 255)
    @Column(name = "ATMType")
    private String aTMType;
    @Size(max = 255)
    @Column(name = "Bank")
    private String bank;
    @Size(max = 255)
    @Column(name = "CardType")
    private String cardType;
    @Size(max = 255)
    @Column(name = "NumberCard")
    private String numberCard;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Discriminator")
    private String discriminator;
    @Size(max = 255)
    @Column(name = "Owner2")
    private String owner2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentID")
    private List<Billatcounter> billatcounterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentID")
    private List<Order1> order1List;

    public Payment() {
    }

    public Payment(Integer id) {
        this.id = id;
    }

    public Payment(Integer id, int type, String discriminator) {
        this.id = id;
        this.type = type;
        this.discriminator = discriminator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getATMType() {
        return aTMType;
    }

    public void setATMType(String aTMType) {
        this.aTMType = aTMType;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getOwner2() {
        return owner2;
    }

    public void setOwner2(String owner2) {
        this.owner2 = owner2;
    }

    @XmlTransient
    public List<Billatcounter> getBillatcounterList() {
        return billatcounterList;
    }

    public void setBillatcounterList(List<Billatcounter> billatcounterList) {
        this.billatcounterList = billatcounterList;
    }

    @XmlTransient
    public List<Order1> getOrder1List() {
        return order1List;
    }

    public void setOrder1List(List<Order1> order1List) {
        this.order1List = order1List;
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Payment[ id=" + id + " ]";
    }
    
}
