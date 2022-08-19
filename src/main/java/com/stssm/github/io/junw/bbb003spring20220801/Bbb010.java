package com.stssm.github.io.junw.bbb003spring20220801;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao001;
import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao002;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService001;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-08-19-43  星期一
 * @description
 * @return
 * @exception
 */
public class Bbb010 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb011.xml");
		System.out.println("执行DemoDao001的获取过程：");
		DemoDao001 xmlDemoDao001 = (DemoDao001) ctx.getBean("xmlDemoDao001");
		System.out.println("执行DemoDao002的获取过程：");
		DemoDao002 xmlDemoDao002 = (DemoDao002) ctx.getBean("xmlDemoDao002");
		System.out.println("执行ServiceDao001的获取过程：");
		DemoService001 xmlService001 = (DemoService001) ctx.getBean("xmlDemoService001");
		System.out.println("===============================================");
		xmlDemoDao001.dao001Show();
		System.out.println("===============================================");
		xmlDemoDao002.dao002Show();
		System.out.println("===============================================");
		xmlService001.service001Show();

	}
}
