package com.stssm.github.io.junw.bbb013spring20221231.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

@Component
@Aspect
public class Demo1231Aop {
	@Pointcut("execution(* com.stssm.github.io.junw.bbb013spring20221231.dao.impl.Demo1231DaoImpl.findName(..))")
	private void cutIn() {
		// 需要说明一点，如果这里的方法是有参数的，我们不需要把参数加进去
		// 但是，需要加入通配符，表示参数的存在
	}

	@Around("cutIn()")
	private Object cutInAround(ProceedingJoinPoint pjp) throws Throwable {
		demorun.debug("我是aop中的around方法体");
		Object[] args = pjp.getArgs();
		args[0] = 111;
		return pjp.proceed(args);
		// 和下面一样，如果数据异常，可以在proceed里面完成处理的操作
		// 但是传不传args进入proceed中，实际上对proceed的返回没有影响
		// 如果传入了经过修改的args，那么proceed里面就会返回新的值
	}

	@Before("cutIn()")
	private void beforeCutIn(JoinPoint jp) {
		demorun.debug("我是切入点后的before方法");
		demorun.debug("我是参数集合：" + Arrays.toString(jp.getArgs()));
		// 这里找到的参数，实际上是方法中的实参
		// 比如我的show(11,12)
		// 如果这里打印了对应的参数，就会出现[11,12]这样的结果
		// 但是这里和Java的规则又相互违背
		// java规定了，必须使用一样类型的元素作为参数，这样直接返回结果，前面的方法定义中，可能存在[11,"demo"]这样的复合参数
	}

	@After("cutIn()")
	private void cutInAfter(JoinPoint jp) {
		demorun.debug("我是切入点后的after方法");
		Object[] args = jp.getArgs();
		args[0] = 1111;
		demorun.debug("我是after参数集合：" + Arrays.toString(jp.getArgs()));
		// 这里可以手动修改参数
		// 意味着，本质上这些数据都可以进一步完成处理
	}

	@AfterReturning(value = "cutIn()", returning = "obj")
	private void afterReturning(JoinPoint jp, Object obj) {
		// private void afterReturning(Object obj) {
		// 这里的参数接收和上面类似，但是需要进一步处理
		// 首先，这里的形参不是projectProceeding,而是object
		//     String value() default "";
		//     String pointcut() default "";
		//     String returning() default "";
		//     String argNames() default "";
		// 上面的注解中，定义了以上四个变量
		// 返回来说，就是四个变量可以用参数的形式在我们的注解中存在
		demorun.debug(FINAL_SPLIT);
		demorun.debug("我是afterReturning返回值" + obj);
		// 这里也需要说明：如果JoinPoint jp存在，那就必须作为第一个参数
	}

	@AfterThrowing(value = "cutIn()", throwing = "throwable")
	private void afterThrowing(Throwable throwable) {
		demorun.debug("我是afterThrowing返回值：" + throwable);// java.lang.NullPointerException
		// 这里和上面的参数接收方式也是不一样的
	}
}
