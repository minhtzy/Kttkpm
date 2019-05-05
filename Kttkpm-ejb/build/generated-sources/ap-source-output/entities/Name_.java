package entities;

import entities.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Name.class)
public class Name_ { 

    public static volatile SingularAttribute<Name, String> firstName;
    public static volatile SingularAttribute<Name, String> lastName;
    public static volatile ListAttribute<Name, Employee> employeeList;
    public static volatile SingularAttribute<Name, String> middleName;
    public static volatile SingularAttribute<Name, Integer> id;

}