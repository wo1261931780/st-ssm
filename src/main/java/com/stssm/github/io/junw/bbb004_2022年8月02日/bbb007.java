package com.stssm.github.io.junw.bbb004_2022年8月02日;

import com.stssm.github.io.dao.userDao5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004_2022年8月02日
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-30  星期二
 * @description
 */
public class bbb007 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb003SpringContext.xml");
		userDao5 userDao5 = (com.stssm.github.io.dao.userDao5) ctx.getBean("userDao5");
		userDao5.show();



	}
}
