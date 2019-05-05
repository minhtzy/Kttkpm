/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Brandclothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface BrandclothesFacadeLocal {

    void create(Brandclothes brandclothes);

    void edit(Brandclothes brandclothes);

    void remove(Brandclothes brandclothes);

    Brandclothes find(Object id);

    List<Brandclothes> findAll();

    List<Brandclothes> findRange(int[] range);

    int count();
    
}
