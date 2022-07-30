package com.stssm.github.io.stssm.github.io;

import com.stssm.github.io.dao.BookDao;
import com.stssm.github.io.factory.FactoryDao;
import com.stssm.github.io.factory.FactoryStaticDao;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.stssm.github.io
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-15-30  星期六
 * @description
 * @return
 * @exception
 */
public class bbb002 {
	public static  void main(String[] args) {
		// 这里拿到的就是ioc对象
		// SpringContext x = new ClassPathXmlApplicationContext("SpringContext.xml");
		// BookDao res1= x.getBean("demoBean");
		// BookDao res2= x.getBean("demoBean");
		// -------------------------------------------------
		// System.out.println(res1);
		// System.out.println(res2);
		// 通过打印多个对象的地址，可以发现，这是同一个对象
		// 使用了单例设计模式
		// res1.show();
		// -------------------------------------------------
		// 第二种方法，新建一个静态工厂来新建对象
		FactoryDao factoryDao = new FactoryDao();
		BookDao bookDao = factoryDao.getBookDao();
		bookDao.show();
		// 以前的造对象方法
		// 使用静态方式构造对象
		// -------------------------------------------------
		FactoryStaticDao factoryStaticDao = new FactoryStaticDao();


	}
}
