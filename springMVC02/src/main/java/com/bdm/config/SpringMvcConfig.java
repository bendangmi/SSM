package com.bdm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.bdm.controller")
// 开启JSON 转对象的功能
@EnableWebMvc
public class SpringMvcConfig {
}
