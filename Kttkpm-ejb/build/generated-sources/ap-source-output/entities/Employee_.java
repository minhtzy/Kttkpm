package entities;

import entities.Account;
import entities.Address;
import entities.Billatcounter;
import entities.Billonline;
import entities.Name;
import entities.Phone;
import entities.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Account> accountID;
    public static volatile SingularAttribute<Employee, Role> roleID;
    public static volatile SingularAttribute<Employee, Phone> phoneID;
    public static volatile ListAttribute<Employee, Billatcounter> billatcounterList;
    public static volatile SingularAttribute<Employee, Name> nameID;
    public static volatile SingularAttribute<Employee, Integer> id;
    public static volatile SingularAttribute<Employee, Integer> type;
    public static volatile SingularAttribute<Employee, String> email;
    public static volatile SingularAttribute<Employee, String> discriminator;
    public static volatile SingularAttribute<Employee, Address> addressID;
    public static volatile ListAttribute<Employee, Billonline> billonlineList;

}