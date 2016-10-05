package com.learning.dao;

import com.learning.model.Spittle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository("spittleDao")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SpittleDaoImpl implements SpittleDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void addSpittle(final Spittle spittle) {
        em.persist(spittle);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void saveSpittle(final Spittle spittle) {
        em.merge(spittle);
    }

    public Spittle getSpittleById(String id) {
        return em.find(Spittle.class, id);
    }

    public List<Spittle> getRecentSpittles(int size) {
        Query query = em.createQuery("SELECT s FROM Spittle  s");
        return query.getResultList();
    }
}
