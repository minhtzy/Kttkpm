package entities;

import entities.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Phone2.class)
public class Phone2_ { 

    public static volatile SingularAttribute<Phone2, String> number;
    public static volatile SingularAttribute<Phone2, String> codeArea;
    public static volatile ListAttribute<Phone2, Customer> customerList;
    public static volatile SingularAttribute<Phone2, Integer> id;

}