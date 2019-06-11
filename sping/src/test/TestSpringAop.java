import jdbc.JDBCtest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Landlord;
import pojo.Role;

import java.sql.SQLException;

/**
 * 测试切面
 */
public class TestSpringAop {
    public static void main(String[] args) throws SQLException {

        /*ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        Landlord landlord = context.getBean("landlord", Landlord.class);
        landlord.service();*/


        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        JDBCtest jdbc = (JDBCtest) context.getBean("jdbc");

        Role role = jdbc.getOne(1);
        System.out.println(role.getRoleid());
        System.out.println(role.getRolename());

    }
}
