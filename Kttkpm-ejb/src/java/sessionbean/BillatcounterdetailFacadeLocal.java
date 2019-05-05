/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Billatcounterdetail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface BillatcounterdetailFacadeLocal {

    void create(Billatcounterdetail billatcounterdetail);

    void edit(Billatcounterdetail billatcounterdetail);

    void remove(Billatcounterdetail billatcounterdetail);

    Billatcounterdetail find(Object id);

    List<Billatcounterdetail> findAll();

    List<Billatcounterdetail> findRange(int[] range);

    int count();
    
}
