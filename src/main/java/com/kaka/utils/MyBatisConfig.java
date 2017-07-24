package com.kaka.utils;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by QIEGAO on 2017/7/22.
 */
@Configuration
@MapperScan(basePackages = "com.kaka.mapper")
public class MyBatisConfig {
    @Autowired
    private Environment env;

    /**
     * 根据数据源创建SqlSessionFactory
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(dataSource);//指定数据源(这个必须有，否则报错)
        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        fb.setTypeAliasesPackage(env.getProperty("com.kaka.mapper"));//指定基包
//        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("classpath:mapper")));//指定xml文件位置

        return fb.getObject();
    }

}
