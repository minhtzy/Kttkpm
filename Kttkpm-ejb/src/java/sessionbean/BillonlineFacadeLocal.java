/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Billonline;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface BillonlineFacadeLocal {

    void create(Billonline billonline);

    void edit(Billonline billonline);

    void remove(Billonline billonline);

    Billonline find(Object id);

    List<Billonline> findAll();

    List<Billonline> findRange(int[] range);

    int count();
    
}
