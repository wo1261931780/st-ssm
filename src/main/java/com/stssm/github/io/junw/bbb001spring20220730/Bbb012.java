package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.factory.FactoryDao;
import com.stssm.github.io.factory.FactoryStaticDao;
import com.stssm.github.io.junw.bbb001spring20220730.dao.BookDao0730;

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
public class Bbb012 {
	public static void main(String[] args) {
		// -------------------------------------------------
		// 第二种方法，新建一个静态工厂来新建对象
		FactoryStaticDao factoryStaticDao = new FactoryStaticDao();
		BookDao0730 bookDao0730 = FactoryStaticDao.getBookDao();
		bookDao0730.daoShow();
		// 以前的造对象方法
		// 使用静态方式构造对象
		// -------------------------------------------------
		FactoryDao factoryDao = new FactoryDao();


	}
}
