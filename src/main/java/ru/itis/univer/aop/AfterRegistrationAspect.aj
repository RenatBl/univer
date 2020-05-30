package ru.itis.univer.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

import java.time.LocalDateTime;
import java.util.Arrays;

@Slf4j
@Aspect
public aspect AfterRegistrationAspect {

    @After("execution(* ru.itis.univer.services.SignUpService.signUp())")
    public void logAfterRegistration(JoinPoint joinPoint) {
        log.info("Method " + joinPoint.getSignature().getName() + " is worked at " + LocalDateTime.now());
        log.info("Arguments: " + Arrays.toString(joinPoint.getArgs()));
    }

}
