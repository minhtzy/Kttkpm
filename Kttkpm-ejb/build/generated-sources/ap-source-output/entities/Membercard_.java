package entities;

import entities.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Membercard.class)
public class Membercard_ { 

    public static volatile SingularAttribute<Membercard, String> code;
    public static volatile SingularAttribute<Membercard, Customer> customerID;
    public static volatile SingularAttribute<Membercard, Integer> id;
    public static volatile SingularAttribute<Membercard, Integer> type;
    public static volatile SingularAttribute<Membercard, Integer> consumer;
    public static volatile SingularAttribute<Membercard, Integer> coin;

}