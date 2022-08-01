package com.bdm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-15:07
 */
// Configuration注解用于设定当前类为配置类
@Configuration
// ComponentScan注解用于设定扫描路径，此注解只能添加一次，多个数据用数组格式
@ComponentScan({"com.bdm"})
@PropertySource({"jdbc.properties.properties"})
@Import({JDBCConfig.class})
public class SpringConfig {


}
