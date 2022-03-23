import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DateSourceTest {
    //手动创建druid数据源
   @Test
   public void Test01() throws SQLException {
       DruidDataSource druidDataSource = new DruidDataSource();
       druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
       druidDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useSSL=true&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
       druidDataSource.setUsername("root");
       druidDataSource.setPassword("123456");
       DruidPooledConnection connection = druidDataSource.getConnection();
       System.out.println(connection);
       connection.close();
   }

   //spring容器来连接
   @Test
    public void Test02() throws SQLException {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
       DataSource datasource = (DataSource) context.getBean("dataSource");
       Connection connection = datasource.getConnection();
       System.out.println(connection);

   }
}
