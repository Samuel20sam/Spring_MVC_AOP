package com.bridgelabz.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //This method is called as point cut (Method/code we want to run at the joint point)
    //'execution' represents for which method we want the point cut to execute.
    // For matching method execution join points
    // This is the primary pointcut designator you will use when working with Spring AOP

    @Before("execution(* com.bridgelabz.springaop.ShoppingCart.checkOut())")
    public void beforeLogger() {
        System.out.println("Before logger point cut is executed before checkOut");
    }

    @After("execution(* *.*.*.*.checkOut())") //'any return type' 'any package'.'any class'
    public void afterLogger() {
        System.out.println("After logger point cut is executed after checkOut");
    }
    //This method is called as point cut (Method/code we want to run at the joint point)
    @Before("execution(* com.bridgelabz.springaop.ShoppingCart.checkOutWithParameter(..))")
    public void beforeLoggerForParameter(JoinPoint jp) {
        System.out.println(jp.getSignature());
        System.out.println("\nBefore logger point cut is executed before checkOutWithParameter");
    }

    @After("execution(* *.*.*.*.checkOutWithParameter(..))") //'any return type' 'any package'.'any class'
    public void afterLoggerForParameter(JoinPoint jp) {
       String str = jp.getArgs()[0].toString();              //Returns array of arguments
        System.out.println("After logger point cut is executed after checkOutWithParameter: " +str);
    }

    @Pointcut("execution(* com.bridgelabz.springaop.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "returnVal")
    public void afterReturning(String returnVal){
        System.out.println("\nAfter returning is executed, return value :" +returnVal);
    }
}