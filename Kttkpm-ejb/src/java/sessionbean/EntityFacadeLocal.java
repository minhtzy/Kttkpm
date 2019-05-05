/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Entity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface EntityFacadeLocal {

    void create(Entity entity);

    void edit(Entity entity);

    void remove(Entity entity);

    Entity find(Object id);

    List<Entity> findAll();

    List<Entity> findRange(int[] range);

    int count();
    
}
