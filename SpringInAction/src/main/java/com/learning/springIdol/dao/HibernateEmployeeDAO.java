package com.learning.springIdol.dao;

import com.learning.springIdol.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class HibernateEmployeeDAO implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public Employee getEmployeeById(String id) {
//        return (Employee)currentSession().get(Employee.class, id);
        return (Employee) this.sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    public void addEmployee(Employee employee) {
        this.sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    public void saveEmployee(Employee employee) {
        this.sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }
}
