package fr.epita.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate template;
    private static String INSERT_QUERY = "insert into course( id, name, author) values(?,?,?);";
    private static String DELETE_QUERY = " DELETE FROM COURSE  WHERE ID = ? ;";
    private static String SELECT_QUERY = " SELECT * FROM COURSE WHERE ID = ? ;";
    public void insert(Course course){
        template.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }
    public void deleteById(long id){
        template.update(DELETE_QUERY,id);
    }
    public Course findById(long id){
        // ResultSet -> Bean => Row Mapper
        return  template.queryForObject( SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
