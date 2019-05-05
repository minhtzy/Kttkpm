/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Brandelectric;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface BrandelectricFacadeLocal {

    void create(Brandelectric brandelectric);

    void edit(Brandelectric brandelectric);

    void remove(Brandelectric brandelectric);

    Brandelectric find(Object id);

    List<Brandelectric> findAll();

    List<Brandelectric> findRange(int[] range);

    int count();
    
}
