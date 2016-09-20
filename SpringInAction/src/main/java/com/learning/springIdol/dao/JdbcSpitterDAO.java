package com.learning.springIdol.dao;

import com.learning.springIdol.model.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcSpitterDAO extends JdbcDaoSupport implements SpitterDAO {
    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    private static final String SQL_INSERT_TEST =
            "insert into test(id, name, address, age, sex) values(?, ?, ?, ?, ?)";

    private static final String SQL_UPDATE_TEST =
            "update test set address = ?, age = ? where id = ?";

    private static final String SQL_SELECT_TEST =
            "select * from test where id = ?";

    public Spitter getSpitterById(String id) {
        return (Spitter)getJdbcTemplate().queryForObject(SQL_SELECT_TEST, new Object[] {id}, new SpitterRowMapper());
    }

    public void addSpitter(Spitter spitter) {
        try {
            getJdbcTemplate().update(SQL_INSERT_TEST, spitter.getId(), spitter.getName(), spitter.getAddress(),
                    spitter.getAge(), spitter.getSex());
        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveSpitter(Spitter spitter) {
        try {
            getJdbcTemplate().update(SQL_UPDATE_TEST, spitter.getAddress(),
                    spitter.getAge(), spitter.getId());
        } catch(DataAccessException e) {
            System.out.println(e.getMessage());
        }
    }

    public class SpitterRowMapper implements RowMapper {
        public Object mapRow(ResultSet resultSet, int i) throws SQLException {
            Spitter spitter = new Spitter();
            spitter.setId(resultSet.getString("ID"));
            spitter.setName(resultSet.getString("NAME"));
            spitter.setAddress(resultSet.getString("ADDRESS"));
            spitter.setAge(resultSet.getInt("AGE"));
            spitter.setSex(resultSet.getString("SEX"));
            return spitter;
        }
    }
}
