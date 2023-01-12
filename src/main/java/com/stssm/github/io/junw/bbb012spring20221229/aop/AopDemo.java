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
public class AopDemo {

	// @Pointcut("execution(void com.stssm.github.io.junw.bbb011spring20221226.dao.impl.Demo1226DaoImpl.show())")
	// private void cutIn1() {
	// 	// demorun.debug("我是切入点1");
	// 	// demorun.debug(FINAL_SPLIT);
	// 	// 切入点方法应该具有空体
	// 	// 说人话就是，切入点方法中，不允许存在这些表达式
	// }
	//
	// // @Before("cutIn1()")
	// private void before1() {
	// 	demorun.debug("我是切入点之前的执行方法");
	// 	demorun.debug("执行完毕");
	// 	demorun.debug(FINAL_SPLIT);
	// }
	//
	// // @After("cutIn1()")
	// private void after1() {
	// 	demorun.debug("我是切入点之后的执行方法");
	// 	demorun.debug("执行完毕");
	// 	demorun.debug(FINAL_SPLIT);
	// }
	//
	// @Around("cutIn1()")
	// private Object around1(ProceedingJoinPoint pjp) throws Throwable {
	// 	demorun.debug("我是切入点周围的方法");
	// 	Object returnObject = pjp.proceed();// 为了避免原始的操作存在异常，这里就直接抛出
	// 	demorun.debug("执行完毕");
	// 	demorun.debug(FINAL_SPLIT);
	// 	// 还是返回值的问题
	// 	// 如果原始的方法存在返回值，那么这里就必须存在一个返回类型，否则会报错
	// 	// 因为我们有的时候无法确定具体的返回类型是什么
	// 	// 所以在这里就抛出一个object作为返回类型
	// 	return returnObject;
	// }
	//
	// // @AfterReturning("cutIn1()")
	// private void afterReturning1() {
	// 	demorun.debug("我是切入点之后的returning方法");
	// 	demorun.debug("执行完毕");
	// 	demorun.debug(FINAL_SPLIT);
	// 	// 这个方法比较特殊，只有在正常结束的时候才会执行
	// 	// 如果出现了异常，after会正常出现，但是afterReturning不会执行
	// }
	// // @AfterThrowing("cutIn1()")
	// private void afterThrowing1() {
	// 	demorun.debug("我是切入点之后的Throwing方法");
	// 	demorun.debug("执行完毕");
	// 	demorun.debug(FINAL_SPLIT);
	// 	// 这个方法比较特殊，只有在切入点抛出异常的时候才会执行
	// }
}
