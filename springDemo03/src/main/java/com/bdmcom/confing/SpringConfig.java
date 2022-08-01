package com.bdmcom.confing;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-18:53
 */
@Configuration
@ComponentScan("com.bdmcom")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
