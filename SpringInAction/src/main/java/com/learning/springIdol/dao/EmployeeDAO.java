package com.learning.springIdol.dao;

import com.learning.springIdol.model.Employee;

public interface EmployeeDAO {
    public void addEmployee(Employee employee);
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public Employee getEmployeeById(String id);
}
