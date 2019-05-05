package entities;

import entities.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile ListAttribute<Role, Employee> employeeList;
    public static volatile SingularAttribute<Role, String> name;
    public static volatile SingularAttribute<Role, Integer> id;

}