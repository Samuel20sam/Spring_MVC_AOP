package com.bridgelabz.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    //'within' represents for which class we want the all the point cuts available to execute.
    // limits matching to join points within certain types
    // (simply the execution of a method declared within a matching type when using Spring AOP)
    
    @Pointcut("within(com.bridgelabz.springaop..*)")
    public void authenticationPointCut() {

    }

    @Pointcut("within(com.bridgelabz.springaop..*)")
    public void authorisationPointCut() {

    }

    @Before("authenticationPointCut() && authorisationPointCut()")
    public void authenticate(){
        System.out.println("\nAuthenticated\n");
    }
}
