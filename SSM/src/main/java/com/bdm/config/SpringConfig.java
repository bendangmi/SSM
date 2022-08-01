package com.bdm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/8/1-6:56
 */
@Configuration
@ComponentScan({"com.bdm.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
// 开启事务
@EnableTransactionManagement
public class SpringConfig {
}
