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
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb002.xml");
		DemoService2 demoService2 = (DemoService2) ctx.getBean("demoService2");
		demoService2.servieShow2();
		String format = String.format("我是运行类：现在打印xml给我的service对象：%s", demoService2);
		demorun.debug(format);
	}
}
