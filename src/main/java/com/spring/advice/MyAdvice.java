package com.spring.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Aspect

//增强类，内部提供增强方法
public class MyAdvice {

    //切点表达式的抽取
    @Pointcut("execution(void com.spring.service.impl.UserServiceImpl.show1())")
    public void myPointcut(){}

    //<aop:before method="beforeAdvice" pointcut-ref="myPointcut"></aop:before>
    @Before("myPointcut()")
    public void beforeAdvice(){
        System.out.println("前置的增强");
    }

    @AfterReturning("MyAdvice.myPointcut()")
    public void afterReturningAdvice(){
        System.out.println("后置的增强");
    }

    @Around("execution(void com.spring.service.impl.UserServiceImpl.show1()))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前的增强..");
        Object result = proceedingJoinPoint.proceed();//执行目标方法
        System.out.println("环绕后的增强..");
        return result;
    }

    @After("execution(void com.spring.service.impl.UserServiceImpl.show1()))")
    public void afterAdvice(){
        System.out.println("最终的增强");
    }
}
