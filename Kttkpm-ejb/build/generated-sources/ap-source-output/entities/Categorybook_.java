package entities;

import entities.Book;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Categorybook.class)
public class Categorybook_ { 

    public static volatile SingularAttribute<Categorybook, String> name;
    public static volatile SingularAttribute<Categorybook, Integer> id;
    public static volatile ListAttribute<Categorybook, Book> bookList;

}