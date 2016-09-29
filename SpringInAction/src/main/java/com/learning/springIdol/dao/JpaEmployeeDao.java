package com.learning.springIdol.dao;

import com.learning.springIdol.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JpaEmployeeDao implements EmployeeDAO {
    @Autowired
    private TransactionTemplate transactionTemplate;

    @PersistenceContext
    private EntityManager em;

    public void addEmployee(final Employee employee) {
        transactionTemplate.execute(new TransactionCallback<Void>() {
            public Void doInTransaction(TransactionStatus transactionStatus) {
                try {
                    em.persist(employee);
                } catch (RuntimeException e) {
                    transactionStatus.setRollbackOnly();
                    throw e;
                }
                return null;
            }
        });
    }

    public void saveEmployee(final Employee employee) {
        transactionTemplate.execute(new TransactionCallback<Void>() {
            public Void doInTransaction(TransactionStatus transactionStatus) {
                try {
                    em.merge(employee);
                } catch (RuntimeException e) {
                    transactionStatus.setRollbackOnly();
                    throw e;
                }
                return null;
            }
        });
    }

    public void deleteEmployee(Employee employee) {
        em.remove(employee);
    }
    public Employee getEmployeeById(String id) {
        return em.find(Employee.class, id);
    }
}
