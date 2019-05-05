package entities;

import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Supplier.class)
public class Supplier_ { 

    public static volatile SingularAttribute<Supplier, String> code;
    public static volatile SingularAttribute<Supplier, String> name;
    public static volatile SingularAttribute<Supplier, Integer> id;
    public static volatile SingularAttribute<Supplier, String> addr;
    public static volatile ListAttribute<Supplier, Product> productList;

}