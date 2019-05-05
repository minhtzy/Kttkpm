/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "billatcounter")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billatcounter.findAll", query = "SELECT b FROM Billatcounter b"),
    @NamedQuery(name = "Billatcounter.findById", query = "SELECT b FROM Billatcounter b WHERE b.id = :id"),
    @NamedQuery(name = "Billatcounter.findByDate", query = "SELECT b FROM Billatcounter b WHERE b.date = :date"),
    @NamedQuery(name = "Billatcounter.findByCode", query = "SELECT b FROM Billatcounter b WHERE b.code = :code")})
public class Billatcounter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 255)
    @Column(name = "Code")
    private String code;
    @JoinColumn(name = "PaymentID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Payment paymentID;
    @JoinColumn(name = "EmployeeID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Employee employeeID;
    @JoinColumn(name = "CustomerID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Customer customerID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billAtCounterID")
    private List<Billatcounterdetail> billatcounterdetailList;

    public Billatcounter() {
    }

    public Billatcounter(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Payment getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(Payment paymentID) {
        this.paymentID = paymentID;
    }

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    @XmlTransient
    public List<Billatcounterdetail> getBillatcounterdetailList() {
        return billatcounterdetailList;
    }

    public void setBillatcounterdetailList(List<Billatcounterdetail> billatcounterdetailList) {
        this.billatcounterdetailList = billatcounterdetailList;
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
        if (!(object instanceof Billatcounter)) {
            return false;
        }
        Billatcounter other = (Billatcounter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Billatcounter[ id=" + id + " ]";
    }
    
}
