package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao6;
import com.stssm.github.io.junw.bbb001spring20220730.dao.Factory.DemoDao6Factory;
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
public class Bbb006 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bbb006.xml");
		DemoDao6Factory userDemoDao6Factory = (DemoDao6Factory) ctx.getBean("userDemoDao6Factory");
		// ===================================================================
		// 直接强制转换会报错
		// ===================================================================
		// 按照老的方式，直接拿到对应的对象就可以
		DemoDao6 demoDao6 = userDemoDao6Factory.getDemoDao6();
		demoDao6.show6();
		System.out.println(demoDao6);

		// DemoDao6 demoDao7 = userDemoDao6Factory.getDemoDao6();
		// System.out.println(demoDao7);
		// 不修改配置的情况下，还是单例对象
		// 直接运行上面两行会报错
		// Creating shared instance of singleton bean 'xmlDemoDao6Factroy'
		// Creating shared instance of singleton bean 'userDemoDao6Factory'
		// 单例对象的说明，在控制台也有体现

	}
}
