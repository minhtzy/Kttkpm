/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Electronicaldevice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface ElectronicaldeviceFacadeLocal {

    void create(Electronicaldevice electronicaldevice);

    void edit(Electronicaldevice electronicaldevice);

    void remove(Electronicaldevice electronicaldevice);

    Electronicaldevice find(Object id);

    List<Electronicaldevice> findAll();

    List<Electronicaldevice> findRange(int[] range);

    int count();
    
}
