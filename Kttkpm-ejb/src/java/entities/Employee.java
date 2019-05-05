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
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id"),
    @NamedQuery(name = "Employee.findByEmail", query = "SELECT e FROM Employee e WHERE e.email = :email"),
    @NamedQuery(name = "Employee.findByType", query = "SELECT e FROM Employee e WHERE e.type = :type"),
    @NamedQuery(name = "Employee.findByDiscriminator", query = "SELECT e FROM Employee e WHERE e.discriminator = :discriminator")})
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Discriminator")
    private String discriminator;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeID")
    private List<Billatcounter> billatcounterList;
    @JoinColumn(name = "AccountID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Account accountID;
    @JoinColumn(name = "NameID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Name nameID;
    @JoinColumn(name = "PhoneID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Phone phoneID;
    @JoinColumn(name = "AddressID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Address addressID;
    @JoinColumn(name = "RoleID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Role roleID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeID")
    private List<Billonline> billonlineList;

    public Employee() {
    }

    public Employee(Integer id) {
        this.id = id;
    }

    public Employee(Integer id, int type, String discriminator) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
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

    public Account getAccountID() {
        return accountID;
    }

    public void setAccountID(Account accountID) {
        this.accountID = accountID;
    }

    public Name getNameID() {
        return nameID;
    }

    public void setNameID(Name nameID) {
        this.nameID = nameID;
    }

    public Phone getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(Phone phoneID) {
        this.phoneID = phoneID;
    }

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
        this.addressID = addressID;
    }

    public Role getRoleID() {
        return roleID;
    }

    public void setRoleID(Role roleID) {
        this.roleID = roleID;
    }

    @XmlTransient
    public List<Billonline> getBillonlineList() {
        return billonlineList;
    }

    public void setBillonlineList(List<Billonline> billonlineList) {
        this.billonlineList = billonlineList;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Employee[ id=" + id + " ]";
    }
    
}
