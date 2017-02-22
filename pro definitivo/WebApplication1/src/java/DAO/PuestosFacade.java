/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.Puestos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author josue
 */
@Stateless
public class PuestosFacade extends AbstractFacade<Puestos> {
    @PersistenceContext(unitName = "proPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public PuestosFacade() {
        super(Puestos.class);
    }
    
}
