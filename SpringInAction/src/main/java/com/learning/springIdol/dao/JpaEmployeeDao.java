package com.learning.springIdol.dao;

import com.learning.springIdol.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class JpaEmployeeDao implements EmployeeDAO {
    @PersistenceContext
    private EntityManager em;

    public void addEmployee(Employee employee) {
        em.persist(employee);
    }

    public void saveEmployee(Employee employee) {
        em.merge(employee);
    }

    public void deleteEmployee(Employee employee) {
        em.remove(employee);
    }
    public Employee getEmployeeById(String id) {
        return em.find(Employee.class, id);
    }
}
