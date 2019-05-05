package entities;

import entities.Clothes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Categoryclothes.class)
public class Categoryclothes_ { 

    public static volatile SingularAttribute<Categoryclothes, String> name;
    public static volatile SingularAttribute<Categoryclothes, Integer> id;
    public static volatile ListAttribute<Categoryclothes, Clothes> clothesList;

}