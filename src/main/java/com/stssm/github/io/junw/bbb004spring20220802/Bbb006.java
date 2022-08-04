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
public class Bbb006 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb002SpringContext.xml");
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);
		System.out.println("******************************************");
		DataSource dataSource2 = (DataSource) ctx.getBean("dataSource2");
		System.out.println(dataSource2);


	}
}
