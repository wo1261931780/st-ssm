package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-20  星期日
 * @description
 */
public class Bbb004 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb004.xml");
		DemoService4 demoService4 = (DemoService4) ctx.getBean("xmlDemoService4");
		// 从这里也可以看出，我获取什么样的对象，完全是xml中提供的对象叫什么名字
		// 如果是xmlDemo定位到service4，那就是获取service4
		demoService4.servieShow4();
	}
}
