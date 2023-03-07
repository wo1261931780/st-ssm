package wo1261931780.stssm.junw.bbb012spring20221229.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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
public class AopDemo3 {

	// @Pointcut("execution(void wo1261931780.stssm.junw.bbb012spring20221229.dao.impl.Demo1229DaoImpl.show())")
	// private void cutIn1() {
	// }
	//
	// @Around("AopDemo3.cutIn1()")
	// private Object around1(ProceedingJoinPoint pjp) throws Throwable {
	// 	log.debug("我是切入点周围的方法");
	// 	pjp.proceed();
	// 	log.debug(FINAL_SPLIT);
	// 	return null;
	// }
	//
	// @Before("cutIn1()")
	// private void before1(ProceedingJoinPoint pjp) {
	// 	Object[] pjpArgs = pjp.getArgs();// 获取对象信息
	// 	log.debug(Arrays.toString(pjpArgs));
	// 	Signature pjpSignature = pjp.getSignature();
	// 	log.debug("我是代理对象：" + pjpSignature.getDeclaringType());
	// 	log.debug("我是对象名称：" + pjpSignature.getDeclaringTypeName());
	// 	log.debug("我是代理方法：" + pjpSignature.getName());
	// }
}
