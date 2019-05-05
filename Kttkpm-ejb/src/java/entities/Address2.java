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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "address2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address2.findAll", query = "SELECT a FROM Address2 a"),
    @NamedQuery(name = "Address2.findById", query = "SELECT a FROM Address2 a WHERE a.id = :id"),
    @NamedQuery(name = "Address2.findByNumberHome", query = "SELECT a FROM Address2 a WHERE a.numberHome = :numberHome"),
    @NamedQuery(name = "Address2.findByDistrict", query = "SELECT a FROM Address2 a WHERE a.district = :district"),
    @NamedQuery(name = "Address2.findByCity", query = "SELECT a FROM Address2 a WHERE a.city = :city"),
    @NamedQuery(name = "Address2.findByCountry", query = "SELECT a FROM Address2 a WHERE a.country = :country")})
public class Address2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "NumberHome")
    private String numberHome;
    @Size(max = 255)
    @Column(name = "District")
    private String district;
    @Size(max = 255)
    @Column(name = "City")
    private String city;
    @Size(max = 255)
    @Column(name = "Country")
    private String country;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address2ID")
    private List<Customer> customerList;

    public Address2() {
    }

    public Address2(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(String numberHome) {
        this.numberHome = numberHome;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlTransient
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
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
        if (!(object instanceof Address2)) {
            return false;
        }
        Address2 other = (Address2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Address2[ id=" + id + " ]";
    }
    
}
