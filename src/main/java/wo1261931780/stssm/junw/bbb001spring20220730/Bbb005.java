package wo1261931780.stssm.junw.bbb001spring20220730;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wo1261931780.stssm.junw.bbb001spring20220730.sfactory.DemoDao5StaticFactory;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-20  星期日
 * @description
 */
public class Bbb005 {
	public static void main(String[] args) {
		// 静态工厂有两个获取方式：
		// 第一种是从配置文件中获取
		ApplicationContext context = new ClassPathXmlApplicationContext("bbb006.xml");
		DemoDao5StaticFactory xmlDemoDao5 = (DemoDao5StaticFactory) context.getBean("xmlDemoDao5");
		// ===================================================================
		// 第二种是直接获取
		// DemoDao5StaticFactory staticFactory = new DemoDao5StaticFactory();
		// 静态工厂构造方法，完全不需要构造一个工厂对象
		// DemoDao5 demoDao5 = DemoDao5StaticFactory.getDemoDao5();// 直接在运行类中，调用工厂的方法就可以
		// 这样直接就能通过工厂，拿到一个我们需要的dao5
		// demoDao5.show5();
	}
}
