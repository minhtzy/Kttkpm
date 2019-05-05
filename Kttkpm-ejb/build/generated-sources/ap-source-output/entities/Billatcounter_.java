package entities;

import entities.Billatcounterdetail;
import entities.Customer;
import entities.Employee;
import entities.Payment;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Billatcounter.class)
public class Billatcounter_ { 

    public static volatile SingularAttribute<Billatcounter, Date> date;
    public static volatile SingularAttribute<Billatcounter, String> code;
    public static volatile SingularAttribute<Billatcounter, Payment> paymentID;
    public static volatile ListAttribute<Billatcounter, Billatcounterdetail> billatcounterdetailList;
    public static volatile SingularAttribute<Billatcounter, Customer> customerID;
    public static volatile SingularAttribute<Billatcounter, Employee> employeeID;
    public static volatile SingularAttribute<Billatcounter, Integer> id;

}