package com.stssm.github.io.junw.bbb004spring20220802;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-30  星期二
 * @description
 */
public class Bbb015 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb016DataSource.xml");
		DataSource dataSource = (DataSource) ctx.getBean("xmlDataSource");
		// 这里有点不一样
		// 我在xml中配置的对象名，重构之后不会在这里出现
		// 不会换句话说，这里是不是将双引号的内容全部作为字符串处理？
		System.out.println("我是德鲁伊：" + dataSource);
		System.out.println("******************************************");
		DataSource dataSource2 = (DataSource) ctx.getBean("xmlDataSourcePool");
		System.out.println("我是c3p0连接池：" + dataSource2);
	}
}
