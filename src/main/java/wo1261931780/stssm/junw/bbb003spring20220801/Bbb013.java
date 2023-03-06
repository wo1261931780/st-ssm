package wo1261931780.stssm.junw.bbb003spring20220801;

import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService004;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801
 *
 * @author liujiajun_junw
 * @Date 2022-08-19-43  星期一
 * @description
 */
public class Bbb013 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb014.xml");
		DemoService004 xmlDemoService004 = (DemoService004) ctx.getBean("xmlDemoService004");
		xmlDemoService004.service004Show();
	}
}
