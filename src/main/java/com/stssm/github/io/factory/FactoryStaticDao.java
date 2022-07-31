package com.stssm.github.io.factory;

import com.stssm.github.io.dao.BookDao;
import com.stssm.github.io.dao.impl.BookDaoImpl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.factory
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-16-28  星期六
 * @description
 * @return
 * @exception
 */
public class FactoryStaticDao {
	// 这里有static关键字，是静态的工厂
	public static BookDao getBookDao() {
		System.out.println("静态工厂新建一个dao对象");
		return new BookDaoImpl();
	}

}
