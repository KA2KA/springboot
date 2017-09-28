package com.kaka.shiro;

import com.kaka.shiro.realm.JdbcAuthorizingRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by QIEGAO on 2017/8/10.
 */
@Configuration
public class ShiroConfiguration {

    /**
     * 配置拦截器用于登陆校验
     *
     * @param manager
     * @return
     */
    @Bean(name = "shiroFilter")
    public ShiroFilterFactoryBean shiroFilter(@Qualifier("securityManager") SecurityManager manager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(manager);
        return bean;
    }


    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(JdbcAuthorizingRealm());
        return securityManager;
    }

    /**
     * 需要实现自己的Realm
     *
     * @return
     */
    @Bean
    public Realm JdbcAuthorizingRealm() {
        return new JdbcAuthorizingRealm();
    }
}
