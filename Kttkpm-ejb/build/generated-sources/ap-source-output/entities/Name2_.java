package entities;

import entities.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Name2.class)
public class Name2_ { 

    public static volatile SingularAttribute<Name2, String> firstName;
    public static volatile SingularAttribute<Name2, String> lastName;
    public static volatile SingularAttribute<Name2, String> middleName;
    public static volatile ListAttribute<Name2, Customer> customerList;
    public static volatile SingularAttribute<Name2, Integer> id;

}