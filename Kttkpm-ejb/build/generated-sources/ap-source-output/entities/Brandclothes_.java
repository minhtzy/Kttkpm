package entities;

import entities.Clothes;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Brandclothes.class)
public class Brandclothes_ { 

    public static volatile SingularAttribute<Brandclothes, String> name;
    public static volatile SingularAttribute<Brandclothes, Integer> id;
    public static volatile ListAttribute<Brandclothes, Clothes> clothesList;
    public static volatile SingularAttribute<Brandclothes, String> logoUrl;

}