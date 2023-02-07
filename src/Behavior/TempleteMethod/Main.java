package Behavior.TempleteMethod;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.execute("select * from Test;");
    }
}
