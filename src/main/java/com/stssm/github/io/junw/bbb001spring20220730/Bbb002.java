package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	public static final Logger demorun = LoggerFactory.getLogger("demorun.class");
	public static final String FINAL_SPLIT = "=============================================";

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb002.xml");// 去xml中寻找，我已经配置好的文件
		// 而这个文件，对应的就是一个已经配置好的ioc容器
		// ioc容器中，就存放了我已经添加好的bean
		DemoService2 demoService2 = (DemoService2) ctx.getBean("demoService2");// 根据xml中的id,直接获得对应的对象
		demoService2.servieShow2();
		String format = String.format("我是运行类：现在打印xml给我的service对象：%s", demoService2);
		demorun.debug(format);
	}
}
