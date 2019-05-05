/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Account2;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface Account2FacadeLocal {

    void create(Account2 account2);

    void edit(Account2 account2);

    void remove(Account2 account2);

    Account2 find(Object id);

    List<Account2> findAll();

    List<Account2> findRange(int[] range);

    int count();
    
    public Account2 signinWithUsernameAndPassword(Object username, Object password);
    
}
