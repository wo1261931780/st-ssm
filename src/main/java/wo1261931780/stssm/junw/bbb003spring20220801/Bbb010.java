package wo1261931780.stssm.junw.bbb003spring20220801;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao001;
import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao002;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService001;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801
 *
 * @author liujiajun_junw
 * @Date 2022-08-19-43  星期一
 * @description
 */
public class Bbb010 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb011.xml");
		demorun.debug("执行DemoDao001的获取过程：");
		DemoDao001 xmlDemoDao001 = (DemoDao001) ctx.getBean("xmlDemoDao001");
		demorun.debug("执行DemoDao002的获取过程：");
		DemoDao002 xmlDemoDao002 = (DemoDao002) ctx.getBean("xmlDemoDao002");
		demorun.debug("执行ServiceDao001的获取过程：");
		DemoService001 xmlService001 = (DemoService001) ctx.getBean("xmlDemoService001");
		demorun.debug(FINAL_SPLIT);
		xmlDemoDao001.dao001Show();
		demorun.debug(FINAL_SPLIT);
		xmlDemoDao002.dao002Show();
		demorun.debug(FINAL_SPLIT);
		xmlService001.service001Show();

	}
}
