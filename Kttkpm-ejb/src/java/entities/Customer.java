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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findById", query = "SELECT c FROM Customer c WHERE c.id = :id"),
    @NamedQuery(name = "Customer.findByCode", query = "SELECT c FROM Customer c WHERE c.code = :code"),
    @NamedQuery(name = "Customer.findByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email"),
    @NamedQuery(name = "Customer.findByCoin", query = "SELECT c FROM Customer c WHERE c.coin = :coin"),
    @NamedQuery(name = "Customer.findByType", query = "SELECT c FROM Customer c WHERE c.type = :type"),
    @NamedQuery(name = "Customer.findByDiscriminator", query = "SELECT c FROM Customer c WHERE c.discriminator = :discriminator")})
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Code")
    private String code;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "Email")
    private String email;
    @Column(name = "Coin")
    private Integer coin;
    @Column(name = "Type")
    private Integer type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Discriminator")
    private String discriminator;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerID")
    private List<Billatcounter> billatcounterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerID")
    private List<Order1> order1List;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerID")
    private List<Comment> commentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerID")
    private List<Membercard> membercardList;
    @JoinColumn(name = "Phone2ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Phone2 phone2ID;
    @JoinColumn(name = "Name2ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Name2 name2ID;
    @JoinColumn(name = "Account2ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Account2 account2ID;
    @JoinColumn(name = "Address2ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Address2 address2ID;

    public Customer() {
    }

    public Customer(Integer id) {
        this.id = id;
    }

    public Customer(Integer id, String discriminator) {
        this.id = id;
        this.discriminator = discriminator;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
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

    @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @XmlTransient
    public List<Membercard> getMembercardList() {
        return membercardList;
    }

    public void setMembercardList(List<Membercard> membercardList) {
        this.membercardList = membercardList;
    }

    public Phone2 getPhone2ID() {
        return phone2ID;
    }

    public void setPhone2ID(Phone2 phone2ID) {
        this.phone2ID = phone2ID;
    }

    public Name2 getName2ID() {
        return name2ID;
    }

    public void setName2ID(Name2 name2ID) {
        this.name2ID = name2ID;
    }

    public Account2 getAccount2ID() {
        return account2ID;
    }

    public void setAccount2ID(Account2 account2ID) {
        this.account2ID = account2ID;
    }

    public Address2 getAddress2ID() {
        return address2ID;
    }

    public void setAddress2ID(Address2 address2ID) {
        this.address2ID = address2ID;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Customer[ id=" + id + " ]";
    }
    
}
