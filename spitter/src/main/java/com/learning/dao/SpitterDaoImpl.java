package com.learning.dao;

import com.learning.model.Spitter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("spitterDao")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SpitterDaoImpl implements SpitterDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void addSpitter(final Spitter spitter) {
        em.persist(spitter);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void saveSpitter(final Spitter spitter) {
        em.merge(spitter);
    }

    public Spitter getSpitterById(String id) {
        return em.find(Spitter.class, id);
    }
}
