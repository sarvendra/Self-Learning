package com.learning.springIdol.dao;

import com.learning.springIdol.model.Employee;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class HibernateEmployeeDAO implements EmployeeDAO {
    private static final Logger logger = Logger.getLogger(HibernateEmployeeDAO.class);

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

    public void deleteEmployee(Employee employee) {
        try {
            this.sessionFactory.getCurrentSession().delete(employee);
            logger.debug("Deleted " + employee.getName());
        } catch (IllegalArgumentException e) {
            logger.error("Something went wrong");
        }
    }
}
