package com.bdmcom.confing;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-20:06
 */
public class MybatisConfig {
    // 类型别名的包
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setTypeAliasesPackage("com.bdmcom.domain");
        factoryBean.setDataSource(dataSource);
        return factoryBean;
    }

    // 映射的包
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        final MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.bdmcom.dao");
        return msc;
    }
}

