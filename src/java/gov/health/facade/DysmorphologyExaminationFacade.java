/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.health.facade;

import gov.health.entity.DysmorphologyExamination;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author pdhs
 */
@Stateless
public class DysmorphologyExaminationFacade extends AbstractFacade<DysmorphologyExamination> {
    @PersistenceContext(unitName = "HOPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DysmorphologyExaminationFacade() {
        super(DysmorphologyExamination.class);
    }
    
}
