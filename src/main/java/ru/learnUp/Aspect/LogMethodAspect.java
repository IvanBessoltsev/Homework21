package ru.learnUp.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Aspect
@Slf4j
public class LogMethodAspect {

    @Around("@annotation(ru.learnUp.annotation.LogMethod)")
    public void logMethodData(ProceedingJoinPoint point) {
        String methodName = point.getSignature().getName();
        List<String> args = Arrays.stream(point.getArgs()).map(Object::toString).collect(Collectors.toList());
        System.out.println(methodName + " " + args);
    }


}
