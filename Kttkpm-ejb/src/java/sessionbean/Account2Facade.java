/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Account2;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author minht
 */
@Stateless
public class Account2Facade extends AbstractFacade<Account2> implements Account2FacadeLocal {
    @PersistenceContext(unitName = "Kttkpm-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Account2Facade() {
        super(Account2.class);
    }
    
    @Override
    public Account2 signinWithUsernameAndPassword(Object username, Object password) {
        javax.persistence.Query qr =
        getEntityManager().createNamedQuery(Account2.class.getSimpleName() +
        ".findAccount");
        // truyền các đối số vào
        qr.setParameter("username", username);
        qr.setParameter("password", password);
        return (Account2) qr.getSingleResult();
    }
    
}
