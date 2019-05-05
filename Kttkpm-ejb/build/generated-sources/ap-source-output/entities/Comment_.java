package entities;

import entities.Customer;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Product> productID;
    public static volatile SingularAttribute<Comment, Customer> customerID;
    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, String> content;

}