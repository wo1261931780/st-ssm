package com.stssm.github.io.junw.bbb006spring20220805;

import com.stssm.github.io.junw.bbb006spring20220805.config.SpringConfiguration0805;
import com.stssm.github.io.junw.bbb006spring20220805.dao.impl.Demo0805Dao001Impl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

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
		// 配置类中，就包含了包扫描，扫描到了需要的dao和service
		Demo0805Dao001Impl bean = ctx.getBean(Demo0805Dao001Impl.class);
		Demo0805Dao001Impl bean2 = ctx.getBean(Demo0805Dao001Impl.class);
		demorun.debug("我调用了内部的方法");
		// bean.show();
		demorun.debug(bean.toString());
		demorun.debug(bean2.toString());
		// 这里的两个对象，内存地址一样
		// 换句话来说，这是一种单例设计模式
	}
}
