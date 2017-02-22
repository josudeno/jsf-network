/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.Trabajos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author josue
 */
@Stateless
public class TrabajosFacade extends AbstractFacade<Trabajos> {
    @PersistenceContext(unitName = "proPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public TrabajosFacade() {
        super(Trabajos.class);
    }
    
}
