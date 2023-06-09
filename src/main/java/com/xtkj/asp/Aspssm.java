package com.xtkj.asp;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspssm {
    Logger logger = Logger.getLogger(Aspssm.class.getName());

    @AfterThrowing(pointcut = "execution(* com.xtkj.service.impl.*.*(..))",throwing="e")
    public void errorLog(Exception e){
        logger.error(e.getMessage(),e);
    }
}
