package uz.ibrokhimoff.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import uz.ibrokhimoff.models.Login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AuthUserDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Login> getAll() {
        return jdbcTemplate.query("select id,username,password,role from auth_user", new AuthUserDao.UserRowMapper());
    }


    public static class UserRowMapper implements RowMapper<Login> {
        public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
            Login login=Login.builder()
                    .username(rs.getString("username"))
                    .password(rs.getString("password"))
                    .role(rs.getString("role"))
                    .build();
            return login;
        }
    }


}
