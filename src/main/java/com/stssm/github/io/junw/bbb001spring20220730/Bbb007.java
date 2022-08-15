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
		// 完整的过程如下：
		// 我是dao7构造方法，地址为：com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.DemoDao7Impl@49ec71f8
		// 我是service7中的DI注入
		// 我是service7中的初始化方法
		// 我是service中的show7方法
		// 我是service中的Dao7对象：com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.DemoDao7Impl@49ec71f8
		// 开始调用Dao中的show方法：--------------------------------------
		// 我是dao方法中的show7
		// 下面开始执行关闭=============================================
		// 21:35:31.989 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Closing org.springframework.context.support.ClassPathXmlApplicationContext@4411d970, started on Mon Aug 15 21:35:31 CST 2022
		// ************************************************************************************************
		// ************************************************************************************************
		// ************************************************************************************************
		// 整体来看一遍
		// 首先是xml中配置的两个bean对象，被放入IoC统一管理。
		// 1.构造方法被加载出来
		// 2.service中配置的依赖注入出现


	}
}
