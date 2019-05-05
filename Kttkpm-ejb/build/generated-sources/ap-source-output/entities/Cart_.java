package entities;

import entities.Cartdetail;
import entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Cart.class)
public class Cart_ { 

    public static volatile ListAttribute<Cart, Cartdetail> cartdetailList;
    public static volatile ListAttribute<Cart, Order1> order1List;
    public static volatile SingularAttribute<Cart, Integer> id;
    public static volatile SingularAttribute<Cart, Integer> status;

}