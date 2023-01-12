package com.stssm.github.io.junw.bbb012spring20221229.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229.aop
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-39  星期四
 * @description
 */

@Component
@Aspect
public class AopDemo2 {

	// @Pointcut("execution(void com.stssm.github.io.junw.bbb011spring20221226.dao.impl.Demo1226DaoImpl.show())")
	// private void cutIn1() {
	// }
	//
	// @Around("AopDemo2.cutIn1()")
	// private void around1(ProceedingJoinPoint pjp) throws Throwable {
	// 	demorun.debug("我是切入点周围的方法");
	// 	pjp.proceed();
	// 	demorun.debug("执行完毕");
	// 	demorun.debug(FINAL_SPLIT);
	// 	Signature pjpSignature = pjp.getSignature();
	// 	demorun.debug("我是代理对象：" + pjpSignature.getDeclaringType());
	// 	demorun.debug("我是对象名称：" + pjpSignature.getDeclaringTypeName());
	// 	demorun.debug("我是代理方法：" + pjpSignature.getName());
	// }
}
