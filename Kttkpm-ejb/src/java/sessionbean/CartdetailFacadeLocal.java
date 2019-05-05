/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Cartdetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface CartdetailFacadeLocal {

    void create(Cartdetail cartdetail);

    void edit(Cartdetail cartdetail);

    void remove(Cartdetail cartdetail);

    Cartdetail find(Object id);

    List<Cartdetail> findAll();

    List<Cartdetail> findRange(int[] range);

    int count();
    
}
