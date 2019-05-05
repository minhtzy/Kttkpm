package entities;

import entities.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Address2.class)
public class Address2_ { 

    public static volatile SingularAttribute<Address2, String> country;
    public static volatile SingularAttribute<Address2, String> numberHome;
    public static volatile SingularAttribute<Address2, String> city;
    public static volatile SingularAttribute<Address2, String> district;
    public static volatile ListAttribute<Address2, Customer> customerList;
    public static volatile SingularAttribute<Address2, Integer> id;

}