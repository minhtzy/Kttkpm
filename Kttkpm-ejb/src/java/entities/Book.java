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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "book")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByDes", query = "SELECT b FROM Book b WHERE b.des = :des"),
    @NamedQuery(name = "Book.findByProductID", query = "SELECT b FROM Book b WHERE b.productID = :productID")})
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Des")
    private String des;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private Integer productID;
    @JoinColumn(name = "PublisherID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Publisher publisherID;
    @JoinColumn(name = "CategoryBookID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Categorybook categoryBookID;
    @JoinColumn(name = "ProductID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Product product;
    @JoinColumn(name = "AuthorID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Author authorID;

    public Book() {
    }

    public Book(Integer productID) {
        this.productID = productID;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Publisher getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(Publisher publisherID) {
        this.publisherID = publisherID;
    }

    public Categorybook getCategoryBookID() {
        return categoryBookID;
    }

    public void setCategoryBookID(Categorybook categoryBookID) {
        this.categoryBookID = categoryBookID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Author getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Author authorID) {
        this.authorID = authorID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Book[ productID=" + productID + " ]";
    }
    
}
