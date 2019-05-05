package entities;

import entities.Billonline;
import entities.Cart;
import entities.Customer;
import entities.Payment;
import entities.Shipment;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Order1.class)
public class Order1_ { 

    public static volatile SingularAttribute<Order1, Integer> createdat;
    public static volatile SingularAttribute<Order1, String> note;
    public static volatile SingularAttribute<Order1, Shipment> shipmentID;
    public static volatile SingularAttribute<Order1, Payment> paymentID;
    public static volatile SingularAttribute<Order1, Cart> cartID;
    public static volatile SingularAttribute<Order1, Customer> customerID;
    public static volatile SingularAttribute<Order1, Integer> id;
    public static volatile ListAttribute<Order1, Billonline> billonlineList;

}