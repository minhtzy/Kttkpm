package entities;

import entities.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Phone.class)
public class Phone_ { 

    public static volatile SingularAttribute<Phone, Integer> number;
    public static volatile SingularAttribute<Phone, String> codeArea;
    public static volatile ListAttribute<Phone, Employee> employeeList;
    public static volatile SingularAttribute<Phone, Integer> id;

}