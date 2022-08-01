package com.bdm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/31-12:30
 */
// 创建springmvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.bdm.controller")
public class SpringMvcConfig {

}
