/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Entity2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface Entity2FacadeLocal {

    void create(Entity2 entity2);

    void edit(Entity2 entity2);

    void remove(Entity2 entity2);

    Entity2 find(Object id);

    List<Entity2> findAll();

    List<Entity2> findRange(int[] range);

    int count();
    
}
