package entities;

import entities.Account2;
import entities.Address2;
import entities.Billatcounter;
import entities.Comment;
import entities.Membercard;
import entities.Name2;
import entities.Order1;
import entities.Phone2;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, Comment> commentList;
    public static volatile SingularAttribute<Customer, Name2> name2ID;
    public static volatile SingularAttribute<Customer, String> code;
    public static volatile ListAttribute<Customer, Billatcounter> billatcounterList;
    public static volatile ListAttribute<Customer, Membercard> membercardList;
    public static volatile SingularAttribute<Customer, Integer> type;
    public static volatile SingularAttribute<Customer, Phone2> phone2ID;
    public static volatile SingularAttribute<Customer, String> discriminator;
    public static volatile SingularAttribute<Customer, Address2> address2ID;
    public static volatile ListAttribute<Customer, Order1> order1List;
    public static volatile SingularAttribute<Customer, Integer> id;
    public static volatile SingularAttribute<Customer, Account2> account2ID;
    public static volatile SingularAttribute<Customer, String> email;
    public static volatile SingularAttribute<Customer, Integer> coin;

}