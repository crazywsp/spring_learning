package jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import pojo.Role;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component("jdbc")
public class JDBCtest implements Serializable {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Role getOne(int roleid) throws SQLException {
        String sql1 = "SELECT roleid, rolename FROM tp_role where roleid = ?";
        Role role = (Role) jdbcTemplate.queryForList(sql1, new RowMapper<Role>() {

            @Override
            public Role mapRow(ResultSet resultSet, int i) throws SQLException {
                Role role1 = new Role();
                role1.setRoleid(resultSet.getInt("roleid"));
                role1.setRolename(resultSet.getString("rolename"));
                return role1;
            }
        }, 1);
        return role;
    }



    /*@Autowired
    private DataSource dataSource;

    public Role getOne(int roleId) throws SQLException {

        String sql = "SELECT roleid, rolename FROM tp_role where roleid = " + roleId;
        Role role = new Role();
        Connection con = dataSource.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        if(rs.next()){
            role.setRoleid(rs.getInt("roleid"));
            role.setRolename(rs.getString("rolename"));
        }

        return role;
    }*/
}
