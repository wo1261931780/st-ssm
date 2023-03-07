package wo1261931780.stssm.junw.bbb014spring20230102.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * @author junw
 */
@Aspect
@Slf4j
@Component
public class Demo0102Aop {
	@Pointcut("execution(* com.stssm.github.io.junw.bbb014spring20230102.service.impl.Demo0102ServiceImpl.show0102service(..))")
	private void cutIn() {
	}

	/**
	 * 环绕通知是最核心的通知，
	 * 因为环绕通知可以模拟出其他的通知类型
	 */
	@Around("Demo0102Aop.cutIn()")
	private Object cutInAround(ProceedingJoinPoint pjp) throws Throwable {
		log.debug("我是around方法");
		// 原来是这么玩的，首先我需要不干预dao和service中的方法
		// 然后通过这里的aop，完成对字符串的删除空格操作
		Object[] args = pjp.getArgs();
		for (int i = 0; i < args.length; i++) {
			if (args[i].getClass().equals(String.class)) {
				args[i] = args[i].toString().trim();
			}
		}
		log.debug(Arrays.toString(args));
		Object proceed = pjp.proceed();
		return proceed;
	}
}
