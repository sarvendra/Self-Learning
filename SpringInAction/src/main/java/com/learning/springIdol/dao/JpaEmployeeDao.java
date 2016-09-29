package com.learning.springIdol.dao;

import com.learning.springIdol.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class JpaEmployeeDao implements EmployeeDAO {
    @PersistenceContext
    private EntityManager em;

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void addEmployee(final Employee employee) {
        em.persist(employee);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void saveEmployee(final Employee employee) {
        em.merge(employee);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void deleteEmployee(Employee employee) {
        em.remove(employee);
    }
    public Employee getEmployeeById(String id) {
        return em.find(Employee.class, id);
    }
}
