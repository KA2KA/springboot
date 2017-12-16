package com.kaka.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by QIEGAO on 2017/12/8.
 */
@Configuration
@Aspect
public class AopInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(AopInterceptor.class);

    @Pointcut("execution(public * com.kaka.Application.main())")
    public void webLog() {

    }
    public void doBefore(JoinPoint joinPoint) {

    }

}
