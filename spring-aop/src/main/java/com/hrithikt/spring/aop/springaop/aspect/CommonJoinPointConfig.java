package com.hrithikt.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

	@Pointcut("execution(* com.hrithikt.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	@Pointcut("execution(* com.hrithikt.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("@annotation(com.hrithikt.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
