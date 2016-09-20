package com.learning.springIdol;

import com.learning.springIdol.dao.JdbcSpitterDAO;
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
        JdbcSpitterDAO jdbcSpitterDAO = (JdbcSpitterDAO) context.getBean("jdbcSpitterDAO");
        Spitter spitter = jdbcSpitterDAO.getSpitterById("da834670-13f9-4a4d-bd5c-3acb56662a50");
        spitter.setAddress("C764 Sector 43 Gurgaon");
        spitter.setAge(25);
        jdbcSpitterDAO.saveSpitter(spitter);
    }
}
