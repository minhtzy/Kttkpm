/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Entity2;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author minht
 */
@Stateless
public class Entity2Facade extends AbstractFacade<Entity2> implements Entity2FacadeLocal {
    @PersistenceContext(unitName = "Kttkpm-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Entity2Facade() {
        super(Entity2.class);
    }
    
}
