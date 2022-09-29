package com.stssm.github.io.junw.bbb002spring20220731;

import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao001;
import com.stssm.github.io.junw.bbb002spring20220731.service.impl.UserService001Impl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

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
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bbb008.xml");
		demorun.debug("我是Bbb008运行类中，手动的新建dao对象");
		ctx.getBean("xmlUserDao001");// 获得对象以后，执行初始化方法
		demorun.debug("=============================================");
		demorun.debug("获得对应的service对象：");
		UserService001Impl xmlUserService001 = (UserService001Impl) ctx.getBean("xmlUserService001");// 获得对象以后，就开始执行初始化和依赖注入的过程
		// 我是UserDao001初始化方法
		// 已经完成了UserService001Impl中对UserDao001Impl的依赖注入
		demorun.debug(xmlUserService001 + "对象开始执行serviceShow方法：");
		xmlUserService001.serviceShow();// 我是UserService001中的show方法
		demorun.debug("=============================================");

		// 如果我在这里重新获得一个dao对象
		UserDao001 xmlUserDao001 = (UserDao001) ctx.getBean("xmlUserDao001");
		// 我是UserDao001初始化方法
		// 我是UserDao001中的构造方法
		// 在获得对象的过程中，先完成容器中对象的初始化，然后才进行构造过程
		xmlUserDao001.userDaoShow001();
		// ctx.close();// 直接暴力关机
		// demorun.debug("我是关机后的方法");
		// 类似于system.exit
		// 一旦执行了代码，后续的容器功能都不能执行，而且控制台没有对应说明出现
		demorun.debug("开始关闭ioc");
		ctx.registerShutdownHook();// 关闭钩子，关闭前自动执行
	}
}
