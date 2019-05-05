/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Price;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface PriceFacadeLocal {

    void create(Price price);

    void edit(Price price);

    void remove(Price price);

    Price find(Object id);

    List<Price> findAll();

    List<Price> findRange(int[] range);

    int count();
    
}
