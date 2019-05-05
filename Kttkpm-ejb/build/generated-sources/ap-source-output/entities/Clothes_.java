package entities;

import entities.Brandclothes;
import entities.Categoryclothes;
import entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Clothes.class)
public class Clothes_ { 

    public static volatile SingularAttribute<Clothes, String> colot;
    public static volatile SingularAttribute<Clothes, Product> product;
    public static volatile SingularAttribute<Clothes, String> des;
    public static volatile SingularAttribute<Clothes, Categoryclothes> categoryClothesID;
    public static volatile SingularAttribute<Clothes, Integer> size;
    public static volatile SingularAttribute<Clothes, Integer> gender;
    public static volatile SingularAttribute<Clothes, Integer> productID;
    public static volatile SingularAttribute<Clothes, Brandclothes> brandClothesID;

}