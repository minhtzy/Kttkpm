/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Entity3;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface Entity3FacadeLocal {

    void create(Entity3 entity3);

    void edit(Entity3 entity3);

    void remove(Entity3 entity3);

    Entity3 find(Object id);

    List<Entity3> findAll();

    List<Entity3> findRange(int[] range);

    int count();
    
}
