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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author minht
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"),
    @NamedQuery(name = "Product.findByCode", query = "SELECT p FROM Product p WHERE p.code = :code"),
    @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name"),
    @NamedQuery(name = "Product.findBySupplier", query = "SELECT p FROM Product p WHERE p.supplier = :supplier")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Code")
    private String code;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Column(name = "Supplier")
    private Integer supplier;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Book book;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Electronicaldevice electronicaldevice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Image> imageList;
    @JoinColumn(name = "SupplierID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Supplier supplierID;
    @JoinColumn(name = "DiscountID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Discount discountID;
    @JoinColumn(name = "PriceID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Price priceID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Billatcounterdetail> billatcounterdetailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Cartdetail> cartdetailList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    private Clothes clothes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private List<Comment> commentList;

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSupplier() {
        return supplier;
    }

    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Electronicaldevice getElectronicaldevice() {
        return electronicaldevice;
    }

    public void setElectronicaldevice(Electronicaldevice electronicaldevice) {
        this.electronicaldevice = electronicaldevice;
    }

    @XmlTransient
    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Supplier getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Supplier supplierID) {
        this.supplierID = supplierID;
    }

    public Discount getDiscountID() {
        return discountID;
    }

    public void setDiscountID(Discount discountID) {
        this.discountID = discountID;
    }

    public Price getPriceID() {
        return priceID;
    }

    public void setPriceID(Price priceID) {
        this.priceID = priceID;
    }

    @XmlTransient
    public List<Billatcounterdetail> getBillatcounterdetailList() {
        return billatcounterdetailList;
    }

    public void setBillatcounterdetailList(List<Billatcounterdetail> billatcounterdetailList) {
        this.billatcounterdetailList = billatcounterdetailList;
    }

    @XmlTransient
    public List<Cartdetail> getCartdetailList() {
        return cartdetailList;
    }

    public void setCartdetailList(List<Cartdetail> cartdetailList) {
        this.cartdetailList = cartdetailList;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @XmlTransient
    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Product[ id=" + id + " ]";
    }
    
}
