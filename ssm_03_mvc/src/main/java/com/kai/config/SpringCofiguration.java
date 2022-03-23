package com.kai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//标志该类是Spring的核心配置类
@ComponentScan("com.kai")//    <context:component-scan base-package="com.kai"/>
//<import resource="classpath:"/>
@Import({DataSourceConfiguration.class})
public class SpringCofiguration {


}
