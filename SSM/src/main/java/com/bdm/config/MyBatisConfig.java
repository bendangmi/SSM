package com.bdm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/8/1-6:58
 */
public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean .setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.bdm.domain");
        return factoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        final MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.bdm.dao");
        return msc;
    }
}
