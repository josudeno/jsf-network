/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.Empresas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author josue
 */
@Stateless
public class EmpresasFacade extends AbstractFacade<Empresas> {
    @PersistenceContext(unitName = "proPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpresasFacade() {
        super(Empresas.class);
    }
    
}
