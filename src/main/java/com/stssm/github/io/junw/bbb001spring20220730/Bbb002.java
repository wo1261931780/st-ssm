package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-00  星期日
 * @description
 */
public class Bbb002 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb002.xml");
		DemoService2 demoService2 = (DemoService2) ctx.getBean("demoService2");
		demoService2.servieShow2();
		System.out.println("我是运行类：现在打印xml给我的service对象：" + demoService2);
	}
}
