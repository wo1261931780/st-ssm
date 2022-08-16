package com.stssm.github.io.junw.bbb002spring20220731;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731
 *
 * @author liujiajun_junw
 * @Date 2022-08-07-55  星期二
 * @description
 */
public class Bbb008 {
	public static void main(String[] args) {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb008.xml");
		// ApplicationContext其实也是一个实现类，
		// 而且这个实现类底下并没有close的方法
		// 将其修改为ClassPathXmlApplicationContext就有了
		// *****************************
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bbb008.xml");
		System.out.println("我是Bbb008运行类中，手动的新建dao对象");
		ctx.getBean("UserDao001");

		// BookDao0730 daoBeanXmlId = (BookDao0730) ctx.getBean("daoBeanXmlName");
		// daoBeanXmlId.daoShow();
		// ctx.close();// 直接暴力关机
		// 类似于system.exit
		// 一旦执行了代码，后续的功能都不能执行
		System.out.println("开始关闭ioc");
		ctx.registerShutdownHook();// 关闭钩子，关闭前自动执行
	}
}
