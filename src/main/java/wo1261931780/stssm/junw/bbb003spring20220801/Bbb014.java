package wo1261931780.stssm.junw.bbb003spring20220801;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao006;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-14  星期一
 * @description
 */
public class Bbb014 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb015.xml");
		DemoDao006 xmlDemoDao006 = (DemoDao006) ctx.getBean("xmlDemoDao006");
		xmlDemoDao006.dao006Show();
		String format = String.format("我是dao006：%s", xmlDemoDao006);
		demorun.debug(format);
		// 我是dao006：
		// DemoDao006Impl
		// {
		// dao006Array=[111, 111, 111],
		// dao006List=[list222, list222, list222],
		// dao006Map={map444=map444, map1444=map444},
		// dao006Set=[set333],
		// dao006Properties={add=222, name=123, age=333}
		// }
	}
}
