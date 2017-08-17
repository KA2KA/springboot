package com.kaka.shiro;

import com.kaka.shiro.realm.JdbcAuthorizingRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by QIEGAO on 2017/8/10.
 */
@Configuration
public class ShiroConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(ShiroConfiguration.class);

    @Bean
    public SecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(systemRealm());
        return securityManager;
    }

    /**
     * 需要实现自己的Realm
     *
     * @return
     */
    @Bean
    public Realm systemRealm() {
        Realm realm = new JdbcAuthorizingRealm();
        return realm;
    }
}
