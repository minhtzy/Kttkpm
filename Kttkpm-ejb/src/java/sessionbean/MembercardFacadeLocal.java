/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Membercard;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface MembercardFacadeLocal {

    void create(Membercard membercard);

    void edit(Membercard membercard);

    void remove(Membercard membercard);

    Membercard find(Object id);

    List<Membercard> findAll();

    List<Membercard> findRange(int[] range);

    int count();
    
}
