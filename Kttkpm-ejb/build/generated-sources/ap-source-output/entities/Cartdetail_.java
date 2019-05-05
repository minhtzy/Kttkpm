package entities;

import entities.Cart;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Cartdetail.class)
public class Cartdetail_ { 

    public static volatile SingularAttribute<Cartdetail, Integer> amount;
    public static volatile SingularAttribute<Cartdetail, Product> productID;
    public static volatile SingularAttribute<Cartdetail, Integer> price;
    public static volatile SingularAttribute<Cartdetail, Cart> cartID;
    public static volatile SingularAttribute<Cartdetail, Integer> id;

}