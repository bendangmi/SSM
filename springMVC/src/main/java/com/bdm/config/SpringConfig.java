package com.bdm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/31-15:23
 */
@Configuration
@ComponentScan({"com.bdm.service", "com.bdm.dao"})
public class SpringConfig {
}
