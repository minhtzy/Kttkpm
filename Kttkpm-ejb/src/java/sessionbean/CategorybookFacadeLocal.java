/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Categorybook;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface CategorybookFacadeLocal {

    void create(Categorybook categorybook);

    void edit(Categorybook categorybook);

    void remove(Categorybook categorybook);

    Categorybook find(Object id);

    List<Categorybook> findAll();

    List<Categorybook> findRange(int[] range);

    int count();
    
}
