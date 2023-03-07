package wo1261931780.stssm.junw.bbb012spring20221229.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;

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
@Slf4j
public class AopDemo {

	@Pointcut(value = "execution(void wo1261931780.stssm.junw.bbb012spring20221229.dao.impl.Demo1229DaoImpl.show())")
	private void cutIn1() {
		log.debug("我是切入点1");
		log.debug(FINAL_SPLIT);
		// 切入点方法应该具有空体
		// 说人话就是，切入点方法中，不允许存在这些表达式
	}

	@Before("cutIn1()")
	private void before1() {
		log.debug("我是切入点之前的执行方法");
		log.debug("执行完毕");
		log.debug(FINAL_SPLIT);
	}

	@After("cutIn1()")
	private void after1() {
		log.debug("我是切入点之后的执行方法");
		log.debug("执行完毕");
		log.debug(FINAL_SPLIT);
	}

	@Around("cutIn1()")
	private Object around1(ProceedingJoinPoint pjp) throws Throwable {
		log.debug("我是切入点周围的方法");
		Object returnObject = pjp.proceed();// 为了避免原始的操作存在异常，这里就直接抛出
		log.debug("执行完毕");
		log.debug(FINAL_SPLIT);
		// 还是返回值的问题
		// 如果原始的方法存在返回值，那么这里就必须存在一个返回类型，否则会报错
		// 因为我们有的时候无法确定具体的返回类型是什么
		// 所以在这里就抛出一个object作为返回类型
		return returnObject;
	}

	@AfterReturning("cutIn1()")
	private void afterReturning1() {
		log.debug("我是切入点之后的returning方法");
		log.debug("执行完毕");
		log.debug(FINAL_SPLIT);
		// 这个方法比较特殊，只有在正常结束的时候才会执行
		// 如果出现了异常，after会正常出现，但是afterReturning不会执行
	}

	@AfterThrowing("cutIn1()")
	private void afterThrowing1() {
		log.debug("我是切入点之后的Throwing方法");
		log.debug("执行完毕");
		log.debug(FINAL_SPLIT);
		// 这个方法比较特殊，只有在切入点抛出异常的时候才会执行
	}
}
