package com.kai.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration//标志该类是Spring的核心配置类
@ComponentScan("com.kai")//    <context:component-scan base-package="com.kai"/>
//<import resource="classpath:"/>
@Import({DataSourceConfiguration.class})
public class SpringCofiguration {


}
