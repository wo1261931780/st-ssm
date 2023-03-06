package wo1261931780.stssm.junw.bbb011spring20221226;

import com.stssm.github.io.junw.bbb011spring20221226.config.Spring1226Configuration001;
import com.stssm.github.io.junw.bbb011spring20221226.dao.impl.Demo1226DaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-20  星期一
 * @description
 */
public class Bbb033 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Spring1226Configuration001.class);
		Demo1226DaoImpl demo1226dao = ctx.getBean(Demo1226DaoImpl.class);
		demo1226dao.show();
		// aop就是在不改动原始设计的基础上，附加一部分的功能
		// 比如我这里想使用show功能，只修改执行的show方法，但是会执行show中的计时功能
		// 切面描述的是共性和切入点的关系
		// ===================================================================
		// 要描述关系，就使用通知类
		// 切入点在连接点中
		// 一定是连接点的范围更大
		// ===================================================================
		demorun.debug("" + demo1226dao);
	}
}
