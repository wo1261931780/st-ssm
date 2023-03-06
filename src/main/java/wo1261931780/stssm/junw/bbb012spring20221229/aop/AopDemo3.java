package wo1261931780.stssm.junw.bbb012spring20221229.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.SHOW_LOG;

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
public class AopDemo3 {

	@Pointcut("Demo1229DaoImpl.show()")
	private void cutIn1() {
	}

	@Around("AopDemo3.cutIn1()")
	private Object around1(ProceedingJoinPoint pjp) throws Throwable {
		SHOW_LOG.debug("我是切入点周围的方法");
		pjp.proceed();
		SHOW_LOG.debug(FINAL_SPLIT);
		return null;
	}

	@Before("cutIn1()")
	private void before1(ProceedingJoinPoint pjp) {
		Object[] pjpArgs = pjp.getArgs();// 获取对象信息
		SHOW_LOG.debug(Arrays.toString(pjpArgs));
		Signature pjpSignature = pjp.getSignature();
		SHOW_LOG.debug("我是代理对象：" + pjpSignature.getDeclaringType());
		SHOW_LOG.debug("我是对象名称：" + pjpSignature.getDeclaringTypeName());
		SHOW_LOG.debug("我是代理方法：" + pjpSignature.getName());
	}
}
