package com.bignipple.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: AM9:32
 */
@Aspect
@Component
public class HttpAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(public * com.bignipple.controller.GirlControll.*(..))")
    public void log() {
    }

    @Before("log()")
    public void logBefore(JoinPoint joinpoint) {
        System.out.println(1111);
        logger.info("111111");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("url={}", request.getRequestURL());
        logger.info("method={}", request.getMethod());
        logger.info("class_method={}", joinpoint.getSignature().getDeclaringTypeName()+"."+joinpoint.getSignature().getName());
        logger.info("args={}", joinpoint.getArgs());
    }

    @After("log()")
    public void logAfter() {
        System.out.println(2222);
        logger.info("111111");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void logAfterReturning(Object object) {
        logger.info("response={}", object);
    }
}
