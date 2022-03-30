package ru.learnUp.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAOP {


    @Before("execution(* *(..)")
    public void logMethod() throws Throwable {
        System.out.println("ЗАПУСТИЛСЯ**************************");
    }

    @Around("@annotation(ru.learnUp.annotation.WorkTime)")
    public void workTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        Object obj = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        String nameMethod = proceedingJoinPoint.getSignature().getName();
        System.out.println("Время выполнения метода : " + nameMethod + " составляет " + (end - begin));
    }

}
