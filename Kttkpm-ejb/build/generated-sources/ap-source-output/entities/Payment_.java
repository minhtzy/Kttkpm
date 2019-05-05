package entities;

import entities.Billatcounter;
import entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, String> owner;
    public static volatile SingularAttribute<Payment, String> bank;
    public static volatile SingularAttribute<Payment, String> owner2;
    public static volatile SingularAttribute<Payment, String> cardType;
    public static volatile ListAttribute<Payment, Billatcounter> billatcounterList;
    public static volatile ListAttribute<Payment, Order1> order1List;
    public static volatile SingularAttribute<Payment, Integer> id;
    public static volatile SingularAttribute<Payment, Integer> type;
    public static volatile SingularAttribute<Payment, String> aTMType;
    public static volatile SingularAttribute<Payment, String> numberCard;
    public static volatile SingularAttribute<Payment, String> discriminator;

}