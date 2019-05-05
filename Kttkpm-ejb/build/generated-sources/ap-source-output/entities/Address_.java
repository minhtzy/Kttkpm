package entities;

import entities.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> country;
    public static volatile SingularAttribute<Address, String> numberHome;
    public static volatile ListAttribute<Address, Employee> employeeList;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> district;
    public static volatile SingularAttribute<Address, Integer> id;

}