package com.bdm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-21:04
 */
@Configuration
@ComponentScan("com.bdm")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {
}
