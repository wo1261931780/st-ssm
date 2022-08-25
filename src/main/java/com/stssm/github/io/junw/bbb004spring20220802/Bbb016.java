package com.stssm.github.io.junw.bbb004spring20220802;

import com.stssm.github.io.junw.bbb004spring20220802.dao.Demo0802Dao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-01  星期四
 * @description
 */
public class Bbb016 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bbb017DataSource.xml");
		Demo0802Dao demo0802DaoImpl = (Demo0802Dao) applicationContext.getBean("xmlDemo0802DaoImpl");
		System.out.println("我是dao，即将开始执行方法：");
		demo0802DaoImpl.daoShow();
		// 我是Demo0802Dao中的show方法
		// 我是Demo0802Dao中的变量com.mysql.jdbc.Driver

	}
}
