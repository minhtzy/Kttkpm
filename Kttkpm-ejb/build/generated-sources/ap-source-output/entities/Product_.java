package entities;

import entities.Billatcounterdetail;
import entities.Book;
import entities.Cartdetail;
import entities.Clothes;
import entities.Comment;
import entities.Discount;
import entities.Electronicaldevice;
import entities.Image;
import entities.Price;
import entities.Supplier;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile ListAttribute<Product, Comment> commentList;
    public static volatile SingularAttribute<Product, String> code;
    public static volatile SingularAttribute<Product, Supplier> supplierID;
    public static volatile SingularAttribute<Product, Book> book;
    public static volatile ListAttribute<Product, Billatcounterdetail> billatcounterdetailList;
    public static volatile SingularAttribute<Product, Electronicaldevice> electronicaldevice;
    public static volatile SingularAttribute<Product, Clothes> clothes;
    public static volatile ListAttribute<Product, Cartdetail> cartdetailList;
    public static volatile SingularAttribute<Product, Integer> supplier;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, Discount> discountID;
    public static volatile SingularAttribute<Product, Price> priceID;
    public static volatile ListAttribute<Product, Image> imageList;

}