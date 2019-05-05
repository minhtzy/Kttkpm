package entities;

import entities.Order1;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Shipment.class)
public class Shipment_ { 

    public static volatile SingularAttribute<Shipment, Integer> cost;
    public static volatile ListAttribute<Shipment, Order1> order1List;
    public static volatile SingularAttribute<Shipment, Integer> id;
    public static volatile SingularAttribute<Shipment, Integer> endat;
    public static volatile SingularAttribute<Shipment, String> addr;
    public static volatile SingularAttribute<Shipment, Integer> type;
    public static volatile SingularAttribute<Shipment, Integer> startat;
    public static volatile SingularAttribute<Shipment, String> discriminator;

}