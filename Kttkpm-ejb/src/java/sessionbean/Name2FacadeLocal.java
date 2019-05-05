/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Name2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface Name2FacadeLocal {

    void create(Name2 name2);

    void edit(Name2 name2);

    void remove(Name2 name2);

    Name2 find(Object id);

    List<Name2> findAll();

    List<Name2> findRange(int[] range);

    int count();
    
}
