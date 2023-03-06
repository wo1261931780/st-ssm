package wo1261931780.stssm.junw.bbb015spring20230103;

import com.stssm.github.io.junw.bbb015spring20230103.configuration.Spring0103Configuration001;
import com.stssm.github.io.junw.bbb015spring20230103.dao.Demo0103Dao001;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * @author junw
 */
public class Bbb042 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring0103Configuration001.class);
		// context.register(Spring0103Configuration001.class);
		// 这里的注册和上面的一模一样，都是进入spring的管理
		Demo0103Dao001 demo0103Dao001 = context.getBean(Demo0103Dao001.class);
		demorun.debug("我是获取到的demo0104Dao001对象：" + demo0103Dao001);
		demorun.debug(FINAL_SPLIT);
		// Spring0103Controller spring0104Controller = context.getBean(Spring0103Controller.class);
		// demorun.debug("我是获取到的spring0104Controller对象：" + spring0104Controller);
		// 还是可以获取的，这是为什么？2023年1月4日14:35:30
	}
}
