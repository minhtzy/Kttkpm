package entities;

import entities.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Account2.class)
public class Account2_ { 

    public static volatile SingularAttribute<Account2, String> password;
    public static volatile ListAttribute<Account2, Customer> customerList;
    public static volatile SingularAttribute<Account2, Integer> id;
    public static volatile SingularAttribute<Account2, Integer> account2ID;
    public static volatile SingularAttribute<Account2, String> username;

}