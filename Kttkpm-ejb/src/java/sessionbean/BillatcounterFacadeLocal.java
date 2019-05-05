/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Billatcounter;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface BillatcounterFacadeLocal {

    void create(Billatcounter billatcounter);

    void edit(Billatcounter billatcounter);

    void remove(Billatcounter billatcounter);

    Billatcounter find(Object id);

    List<Billatcounter> findAll();

    List<Billatcounter> findRange(int[] range);

    int count();
    
}
