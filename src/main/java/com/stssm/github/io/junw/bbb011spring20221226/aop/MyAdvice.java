package com.stssm.github.io.junw.bbb011spring20221226.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226.aop
 *
 * @author liujiajun_junw
 * @Date 2022-12-17-53  星期一
 * @description
 */
@Component
@Aspect
public class MyAdvice {
	@Pointcut("execution(void com.stssm.github.io.junw.bbb011spring20221226.dao.impl.demo1226daoImpl.show())")
	private void cutIn() {
	}
	// 执行到这个方法的时候，就是到达切入点，在切入点执行
	// 我们是对原始对象执行的代理
	// aop执行程序的时候，最终是代理对象在运行
	// 而代理，是针对原始的对象完成的，这个原始对象，我们称为目标对象

	@Before("cutIn()")
	private void commonMethod() {
		demorun.debug("我是共享方法");
	}


	public void showTime() {
		long timeMillis = System.currentTimeMillis();
		demorun.debug(timeMillis + "ms");
	}
}
