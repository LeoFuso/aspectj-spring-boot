package com.example.aspectj.spring.boot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.aspectj.spring.boot.aspect.bean.UselessBean;

@Aspect
public class JavaSyntax {

    private UselessBean bean;

    @After("execution(* com.example.aspectj.spring.boot.model.Child.getName())")
    public void afterExecution(JoinPoint joinPoint) {
        System.out.println("after " + joinPoint);
        System.out.println(bean.doUselessBehavior());
    }

    @AfterReturning(value = "execution(* com.example.aspectj.spring.boot.model.Child.getName())", returning = "result")
    public void afterReturning(JoinPoint ignored, String result) {
        System.out.println("Return value: " + result);
    }

    @Around(
            "execution(* com.example.aspectj.spring.boot.model.Parent.getName()) && !execution(* com.example.aspectj.spring.boot.model.Child.getName())")
    public Object aroundExecution(final ProceedingJoinPoint ignored) {
        return "Parent has no name";
    }

    @Autowired
    public void setBean(final UselessBean bean) {
        this.bean = bean;
    }
}
