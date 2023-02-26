package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-50  星期日
 * @description
 */
public class Bbb003 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb003.xml");
		DemoService3 demoService3 = (DemoService3) ctx.getBean("demoService3");
		// 这里的差别在于:
		// 我需要在service中new一个dao出来,然后调用dao对应的方法
		// 所以就引入了di的概念:依赖注入
		demoService3.servieShow3();
		String format = String.format("我是运行类：现在打印xml给我的service对象：%s", demoService3);
		demorun.info(format);
		// 通过打印多个对象的地址，可以发现，这是同一个对象
		// 使用了单例设计模式
		DemoService3 demoService4 = (DemoService3) ctx.getBean("demoService3");
		String format1 = String.format("我是运行类：现在打印xml给我的service对象：%s", demoService4);
		demorun.info(format1);
		// 要修改这个，只需要在xml文件中，配置对应的scope就可以
	}
}
