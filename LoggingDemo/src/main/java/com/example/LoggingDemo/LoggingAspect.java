package com.example.LoggingDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
    
   @Before("execution(* com.example.LoggingDemo.ProductService.getAllDetails(..))")
    public void beforeLogging(JoinPoint joinPoint) {
        logger.info("Executing method: " + joinPoint.getSignature().getName() + " in class: " + joinPoint.getTarget().getClass().getName());
    }
    @After("execution(* com.example.LoggingDemo.ProductController.getById(..))")
    public void afterLogging(JoinPoint joinPoint) {
        // Log the method name and class name where the method was executed
        logger.info("Executing Method: " + joinPoint.getSignature().getName() +
                    " in class: " + joinPoint.getSignature().getDeclaringTypeName());
    }
   @AfterReturning("execution(* com.example.LoggingDemo.ProductController.getAllDetails(..))")
   public void afterSuccessfulLogging(JoinPoint joinPoint) {
	   logger.info("getting details "+joinPoint.getSignature().getClass()+"in class:"+joinPoint.getTarget().getClass());
	   
   }
   @AfterThrowing("execution(* com.example.LoggingDemo.ProductController.getAllDetails(..)")
   public void afterGettingError(JoinPoint joinPoint) {
	   logger.info("executing:"+joinPoint.getSignature().getName()+"in class:"+joinPoint.getTarget().getClass());
	   
   }
   
}
