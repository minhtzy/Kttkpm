package entities;

import entities.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> password;
    public static volatile ListAttribute<Account, Employee> employeeList;
    public static volatile SingularAttribute<Account, Integer> id;
    public static volatile SingularAttribute<Account, String> username;

}