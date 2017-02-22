/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.Profesionales;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author josue
 */
@Stateless
public class ProfesionalesFacade extends AbstractFacade<Profesionales> {
    @PersistenceContext(unitName = "proPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfesionalesFacade() {
        super(Profesionales.class);
    }
    
}
