package entities;

import entities.Employee;
import entities.Order1;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Billonline.class)
public class Billonline_ { 

    public static volatile SingularAttribute<Billonline, Date> date;
    public static volatile SingularAttribute<Billonline, String> code;
    public static volatile SingularAttribute<Billonline, Order1> orderID;
    public static volatile SingularAttribute<Billonline, Employee> employeeID;
    public static volatile SingularAttribute<Billonline, Integer> id;

}