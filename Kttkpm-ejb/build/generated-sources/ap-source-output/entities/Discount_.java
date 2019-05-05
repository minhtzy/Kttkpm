package entities;

import entities.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Discount.class)
public class Discount_ { 

    public static volatile SingularAttribute<Discount, Date> enddate;
    public static volatile SingularAttribute<Discount, Integer> discount;
    public static volatile SingularAttribute<Discount, Integer> id;
    public static volatile SingularAttribute<Discount, Date> startdate;
    public static volatile ListAttribute<Discount, Product> productList;

}