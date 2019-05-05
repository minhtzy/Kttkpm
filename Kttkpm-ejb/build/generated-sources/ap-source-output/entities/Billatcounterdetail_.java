package entities;

import entities.Billatcounter;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Billatcounterdetail.class)
public class Billatcounterdetail_ { 

    public static volatile SingularAttribute<Billatcounterdetail, Integer> amount;
    public static volatile SingularAttribute<Billatcounterdetail, Product> productID;
    public static volatile SingularAttribute<Billatcounterdetail, Integer> price;
    public static volatile SingularAttribute<Billatcounterdetail, Integer> id;
    public static volatile SingularAttribute<Billatcounterdetail, Billatcounter> billAtCounterID;

}