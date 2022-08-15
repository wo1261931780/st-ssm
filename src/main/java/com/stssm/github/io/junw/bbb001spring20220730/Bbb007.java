package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService7;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731
 *
 * @author liujiajun_junw
 * @Date 2022-08-07-59  星期一
 * @description
 */
public class Bbb007 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bbb007.xml");
		DemoService7 xmlDemoService7 = (DemoService7) context.getBean("xmlDemoService7");
		xmlDemoService7.servieShow7();
		System.out.println("下面开始执行关闭=============================================");
		context.close();
	}
}
