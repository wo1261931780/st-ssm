package wo1261931780.stssm.junw.bbb015spring20230103;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import wo1261931780.stssm.junw.bbb015spring20230103.configuration.Spring0103Configuration001;
import wo1261931780.stssm.junw.bbb015spring20230103.dao.Demo0103Dao001;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;


/**
 * @author junw
 */
@Slf4j
public class Bbb042 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring0103Configuration001.class);
		// context.register(Spring0103Configuration001.class);
		// 这里的注册和上面的一模一样，都是进入spring的管理

		Demo0103Dao001 demo0103Dao001 = context.getBean(Demo0103Dao001.class);
		log.debug("我是获取到的demo0104Dao001对象：" + demo0103Dao001);
		log.debug(FINAL_SPLIT);
		// Spring0103Controller spring0104Controller = context.getBean(Spring0103Controller.class);
		// log.debug("我是获取到的spring0104Controller对象：" + spring0104Controller);
		// 还是可以获取的，这是为什么？2023年1月4日14:35:30
	}
}
