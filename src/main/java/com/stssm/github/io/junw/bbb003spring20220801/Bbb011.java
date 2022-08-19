package com.stssm.github.io.junw.bbb003spring20220801;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao003;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService002;
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
public class Bbb011 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb012.xml");
		DemoDao003 xmlDemoDao003 = (DemoDao003) ctx.getBean("xmlDemoDao003");
		xmlDemoDao003.dao003Show();
		System.out.println("------------------------");
		DemoService002 xmlDemoService003 = (DemoService002) ctx.getBean("xmlDemoService002");
		xmlDemoService003.service002Show();


	}
}
