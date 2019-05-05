package entities;

import entities.Brandelectric;
import entities.Categoryelectronic;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Electronicaldevice.class)
public class Electronicaldevice_ { 

    public static volatile SingularAttribute<Electronicaldevice, Integer> cate;
    public static volatile SingularAttribute<Electronicaldevice, Product> product;
    public static volatile SingularAttribute<Electronicaldevice, String> code;
    public static volatile SingularAttribute<Electronicaldevice, String> des;
    public static volatile SingularAttribute<Electronicaldevice, Integer> productID;
    public static volatile SingularAttribute<Electronicaldevice, Integer> gurantee;
    public static volatile SingularAttribute<Electronicaldevice, String> origin;
    public static volatile SingularAttribute<Electronicaldevice, Brandelectric> brandElectricID;
    public static volatile SingularAttribute<Electronicaldevice, Categoryelectronic> categoryElectronicID;

}