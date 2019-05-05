/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Name;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author minht
 */
@Stateless
public class NameFacade extends AbstractFacade<Name> implements NameFacadeLocal {
    @PersistenceContext(unitName = "Kttkpm-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NameFacade() {
        super(Name.class);
    }
    
}
