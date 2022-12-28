package com.stssm.github.io.junw.bbb011spring20221226.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
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
	// 使用Component，表示变成了spring可以控制的bean对象


	@Pointcut("execution(void com.stssm.github.io.junw.bbb011spring20221226.dao.impl.Demo1226DaoImpl.show())")
	private void cutIn() {
	}
	// 执行到这个方法的时候，就是到达切入点，在切入点执行
	// 我们是对原始对象执行的代理
	// aop执行程序的时候，最终是代理对象在运行
	// 而代理，是针对原始的对象完成的，这个原始对象，我们称为目标对象

	@Before("cutIn()")
	private void commonMethod() {
		demorun.debug("我是共享方法");
		demorun.debug(FINAL_SPLIT);
	}
	// 在show方法之前执行上面这个共享方法


	public void showTime() {
		long timeMillis = System.currentTimeMillis();
		demorun.debug(timeMillis + "ms");
	}
}
