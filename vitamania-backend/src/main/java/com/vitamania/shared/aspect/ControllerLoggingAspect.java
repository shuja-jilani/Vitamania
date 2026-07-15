package com.vitamania.shared.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/**
 * TODO:
 * Current aspect is intentionally controller-based for learning Spring AOP.
 *
 * Once service layer is implemented, migrate to:
 * - service-level pointcuts
 * - @Around advice
 * - execution time logging
 * - centralized exception logging
 * - avoid logging sensitive data
 */
@Slf4j
@Aspect
@Component
public class ControllerLoggingAspect {

    @Before("execution(* com.vitamania..controller..*(..))")
    public void logBeforeControllerMethod(JoinPoint joinPoint) {

        log.info(
                "Entering {}.{}()",
                joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName()
        );
    }
}