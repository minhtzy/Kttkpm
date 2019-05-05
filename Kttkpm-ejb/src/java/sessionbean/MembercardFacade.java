/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Membercard;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author minht
 */
@Stateless
public class MembercardFacade extends AbstractFacade<Membercard> implements MembercardFacadeLocal {
    @PersistenceContext(unitName = "Kttkpm-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MembercardFacade() {
        super(Membercard.class);
    }
    
}
