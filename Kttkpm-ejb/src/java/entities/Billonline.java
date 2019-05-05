/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "billonline")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billonline.findAll", query = "SELECT b FROM Billonline b"),
    @NamedQuery(name = "Billonline.findById", query = "SELECT b FROM Billonline b WHERE b.id = :id"),
    @NamedQuery(name = "Billonline.findByDate", query = "SELECT b FROM Billonline b WHERE b.date = :date"),
    @NamedQuery(name = "Billonline.findByCode", query = "SELECT b FROM Billonline b WHERE b.code = :code")})
public class Billonline implements Serializable {
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
    @JoinColumn(name = "EmployeeID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Employee employeeID;
    @JoinColumn(name = "OrderID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Order1 orderID;

    public Billonline() {
    }

    public Billonline(Integer id) {
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

    public Employee getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Employee employeeID) {
        this.employeeID = employeeID;
    }

    public Order1 getOrderID() {
        return orderID;
    }

    public void setOrderID(Order1 orderID) {
        this.orderID = orderID;
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
        if (!(object instanceof Billonline)) {
            return false;
        }
        Billonline other = (Billonline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Billonline[ id=" + id + " ]";
    }
    
}
