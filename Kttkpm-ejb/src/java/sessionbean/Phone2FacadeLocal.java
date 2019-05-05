/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Phone2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface Phone2FacadeLocal {

    void create(Phone2 phone2);

    void edit(Phone2 phone2);

    void remove(Phone2 phone2);

    Phone2 find(Object id);

    List<Phone2> findAll();

    List<Phone2> findRange(int[] range);

    int count();
    
}
