/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Categoryclothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface CategoryclothesFacadeLocal {

    void create(Categoryclothes categoryclothes);

    void edit(Categoryclothes categoryclothes);

    void remove(Categoryclothes categoryclothes);

    Categoryclothes find(Object id);

    List<Categoryclothes> findAll();

    List<Categoryclothes> findRange(int[] range);

    int count();
    
}
