package entities;

import entities.Book;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-05-05T23:19:48")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, Date> birthday;
    public static volatile SingularAttribute<Author, String> name;
    public static volatile SingularAttribute<Author, Integer> id;
    public static volatile ListAttribute<Author, Book> bookList;

}