/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import entities.Shipment;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author minht
 */
@Local
public interface ShipmentFacadeLocal {

    void create(Shipment shipment);

    void edit(Shipment shipment);

    void remove(Shipment shipment);

    Shipment find(Object id);

    List<Shipment> findAll();

    List<Shipment> findRange(int[] range);

    int count();
    
}
