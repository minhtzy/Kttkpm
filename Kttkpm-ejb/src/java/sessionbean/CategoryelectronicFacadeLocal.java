/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Categoryelectronic;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface CategoryelectronicFacadeLocal {

    void create(Categoryelectronic categoryelectronic);

    void edit(Categoryelectronic categoryelectronic);

    void remove(Categoryelectronic categoryelectronic);

    Categoryelectronic find(Object id);

    List<Categoryelectronic> findAll();

    List<Categoryelectronic> findRange(int[] range);

    int count();
    
}
