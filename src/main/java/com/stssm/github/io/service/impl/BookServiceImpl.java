package com.stssm.github.io.service.impl;

import com.stssm.github.io.dao.BookDao;
import com.stssm.github.io.service.BookService;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.service.impl
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-15-12  星期六
 * @description
 * @return
 * @exception
 */
public class BookServiceImpl implements BookService {
	// 左上角出现的小图标，对应的就是后面的spring配置出来的xml
	// private BookDao serviceDao = new BookDaoImpl();
	private BookDao serviceDao;
	// private BookService serviceObj = new BookServiceImpl();

	@Override
	public void serviceShow() {
		System.out.println("我是serviceShow");
		serviceDao.daoShow();
	}
	public void setXmlServiceDao(BookDao xmlServiceDao){
		this.serviceDao = xmlServiceDao;
	}

}
