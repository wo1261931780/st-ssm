package com.stssm.github.io.junw.bbb006spring20220805;

import com.stssm.github.io.junw.bbb006spring20220805.config.SpringConfiguration0805;
import com.stssm.github.io.junw.bbb006spring20220805.dao.Impl.Demo0805Dao001Impl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb006spring20220805
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-07  星期五
 * @description
 */
public class Bbb020 {
	public static void main(String[] args) {
		// ApplicationContext ctx=new ClassPathXmlApplicationContext();
		// 原来是在上面写我们的xml配置文件
		// 这里直接配置到对应的配置类就可以
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration0805.class);
		Demo0805Dao001Impl bean = ctx.getBean(Demo0805Dao001Impl.class);
		Demo0805Dao001Impl bean2 = ctx.getBean(Demo0805Dao001Impl.class);
		System.out.println("我调用了内部的方法");
		// bean.show();
		System.out.println(bean);
		System.out.println(bean2);
		// 这里的两个对象，内存地址一样
		// 换句话来说，这是一种单例设计模式
	}
}