package wo1261931780.stssm.junw.bbb011spring20221226.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226.aop
 *
 * @author liujiajun_junw
 * @Date 2022-12-17-53  星期一
 * @description
 */
@Component("MyAdvice")
@Aspect
@Slf4j
public class MyAdvice {
	// 使用Component，表示变成了spring可以控制的bean对象

	// 下面这里的描述方法，有两种
	// 可以描述抽象类中的方法，也可以描述实现类中的方法
	// 描述的方法，都是有无参数都没有影响
	// 第三种方法，使用通配符完成
	// ===================================================================

	@Pointcut(value = "execution(void wo1261931780.stssm.junw.bbb011spring20221226.dao.impl.Demo1226DaoImpl.show())")
	private void cutIn() {
	}

	// 执行到这个方法的时候，就是到达切入点，在切入点执行
	// 我们是对原始对象执行的代理
	// aop执行程序的时候，最终是代理对象在运行
	// 而代理，是针对原始的对象完成的，这个原始对象，我们称为目标对象

	@Before("cutIn()")
	private void commonMethod() {
		log.debug("我是共享方法");
		log.debug(FINAL_SPLIT);
	}
	// 在show方法之前执行上面这个共享方法

	@Pointcut(value = "execution(* wo1261931780.stssm.junw.bbb011spring20221226.dao.impl.Demo1226DaoImpl.delete(*))")
	private void cutIn2() {
	}

	@Before("cutIn2()")
	private void commonMethod2() {
		log.debug("即将执行删除方法");
		log.debug(FINAL_SPLIT);
	}

	@Pointcut("execution(void *..update())")
	private void cutIn3() {
	}

	@Before("cutIn3()")
	private void commonMethod3() {
		log.debug("我是更新方法");
		log.debug(FINAL_SPLIT);
	}

	// @Pointcut("execution(* *..u*(..))")
	// @Pointcut("execution(* *..*e(..))")
	// 上面分别是以u开头和以e结尾的统配符

	@Pointcut("execution(* *..*(..))")
	private void cutIn4() {
	}

	@Before("cutIn4()")
	private void commonMethod4() {
		log.debug("对任意包下的任意返回值的任意方法");
		log.debug(FINAL_SPLIT);
	}

	@Pointcut("execution(* wo1261931780.stssm.*.*Impl.*())")
	private void cutIn5() {
	}

	@Before("cutIn5()")
	private void commonMethod5() {
		log.debug("对业务层的任意查询方法，添加aop");
		log.debug(FINAL_SPLIT);
	}

	public void showTime() {
		long timeMillis = System.currentTimeMillis();
		log.debug(timeMillis + "ms");
	}
}
