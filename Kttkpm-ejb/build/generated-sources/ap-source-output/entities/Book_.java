package entities;

import entities.Author;
import entities.Categorybook;
import entities.Product;
import entities.Publisher;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Publisher> publisherID;
    public static volatile SingularAttribute<Book, Product> product;
    public static volatile SingularAttribute<Book, String> des;
    public static volatile SingularAttribute<Book, Integer> productID;
    public static volatile SingularAttribute<Book, Categorybook> categoryBookID;
    public static volatile SingularAttribute<Book, Author> authorID;

}