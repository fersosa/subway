package com.gl.subway.aop;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggerPedidosAspect {

	private static final Logger logger = LogManager.getLogger(LoggerPedidosAspect.class);

	@AfterReturning(pointcut = "execution(* com.gl.subway.services.PedidoServices.registrar(..))", returning = "retVal")
	public void doAccessCheck(Object retVal) {
		logger.info("Pedido registrado: " + retVal.toString());
	}
}
