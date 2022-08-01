package com.bdm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.bdm.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-16:43
 */
public class JDBCConfig {
    // 1.定义一个方法获得要管理的对象
    // 2.添加@Bean，表示当前方法的返回值是一个bean
    // 第三方bean

    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/videovip")
    private String url;
    @Value("root")
    private String username;
    @Value("Abc12345678")
    private String password;



    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource dataSource =  new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        return dataSource;
    }
}
