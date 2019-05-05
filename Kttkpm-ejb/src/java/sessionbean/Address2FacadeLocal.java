/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Address2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface Address2FacadeLocal {

    void create(Address2 address2);

    void edit(Address2 address2);

    void remove(Address2 address2);

    Address2 find(Object id);

    List<Address2> findAll();

    List<Address2> findRange(int[] range);

    int count();
    
}
