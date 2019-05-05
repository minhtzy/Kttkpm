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
@Table(name = "name")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Name.findAll", query = "SELECT n FROM Name n"),
    @NamedQuery(name = "Name.findById", query = "SELECT n FROM Name n WHERE n.id = :id"),
    @NamedQuery(name = "Name.findByFirstName", query = "SELECT n FROM Name n WHERE n.firstName = :firstName"),
    @NamedQuery(name = "Name.findByMiddleName", query = "SELECT n FROM Name n WHERE n.middleName = :middleName"),
    @NamedQuery(name = "Name.findByLastName", query = "SELECT n FROM Name n WHERE n.lastName = :lastName")})
public class Name implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "FirstName")
    private String firstName;
    @Size(max = 255)
    @Column(name = "MiddleName")
    private String middleName;
    @Size(max = 255)
    @Column(name = "LastName")
    private String lastName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nameID")
    private List<Employee> employeeList;

    public Name() {
    }

    public Name(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlTransient
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
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
        if (!(object instanceof Name)) {
            return false;
        }
        Name other = (Name) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Name[ id=" + id + " ]";
    }
    
}
