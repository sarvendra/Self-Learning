package com.learning.springIdol;

import com.learning.springIdol.dao.EmployeeDAO;
//import com.learning.springIdol.dao.HibernateEmployeeDAO;
import com.learning.springIdol.model.Employee;
import com.learning.springIdol.model.Spitter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.security.provider.ConfigFile;

import java.util.UUID;

public class PerformerMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-idol.xml", "database-context.xml"});
//        MindReader mindReader = (MindReader) context.getBean("magician");
//        Thinker volunteer = (Thinker) context.getBean("volunteer");
//        volunteer.thinkOfSomething("Queen of hearts");
//        System.out.println(mindReader.getThoughts());
//        JdbcSpitterDAO jdbcSpitterDAO = (JdbcSpitterDAO) context.getBean("jdbcSpitterDAO");
//        Spitter spitter = jdbcSpitterDAO.getSpitterById("da834670-13f9-4a4d-bd5c-3acb56662a50");
//        spitter.setAddress("C764 Sector 43");
//        spitter.setAge(25);
//        jdbcSpitterDAO.saveSpitter(spitter);
        EmployeeDAO jpaEmployeeDAO = (EmployeeDAO) context.getBean("jpaEmployeeDao");
        Employee employee = new Employee();
        employee.setId(UUID.randomUUID().toString());
        employee.setName("Gaurav");
        employee.setAddress("Facebook");
        employee.setAge(27);
        employee.setSex("male");
        jpaEmployeeDAO.addEmployee(employee);
//        Employee employee = jpaEmployeeDAO.getEmployeeById("d06e09cf-5d76-442b-9562-ef2a58c831a5");
//        employee.setSex("Trans");
//        jpaEmployeeDAO.saveEmployee(employee);
    }
}
