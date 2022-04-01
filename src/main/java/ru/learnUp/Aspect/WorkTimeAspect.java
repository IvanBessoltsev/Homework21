package ru.learnUp.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Slf4j
public class WorkTimeAspect {

    @Around("@annotation(ru.learnUp.annotation.WorkTime)")
    public void workTimeComplete(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        Object obj = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        String nameMethod = proceedingJoinPoint.getSignature().getName();
        System.out.println("Время выполнения метода : " + nameMethod + " составляет " + (end - begin));
    }



}
