package com.kaka.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * 日志管理
 *
 * @author wuwanggao@pinming.cn
 */
@Order()
@Aspect
@Configuration
public class LoggerAopConfiguration {

    private static final Logger log = LoggerFactory.getLogger(LoggerAopConfiguration.class);


    // 只关注方法名为find前缀的
    @Pointcut("execution(* find* (..))")
    public void executeService() {
        System.out.println("---------------executeService-----------------------");
    }

    /**
     * 切点方法执行前进行的操作
     * 此处打印请求的各种参数
     *
     * @param joinPoint
     */
    @Before("executeService()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("---------------logBefore-----------------------");
        System.out.println(joinPoint.toString());
    }
    @Around("executeService()")
    public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("------------begin---logAround-----------------------");
        proceedingJoinPoint.proceed();
        System.out.println("---------------logAround---------end--------------");
    }


    @After("executeService()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("---------------logAfter-----------------------");
    }
}
