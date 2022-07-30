package com.stssm.github.io.service.impl;

import com.stssm.github.io.dao.BookDao;
import com.stssm.github.io.dao.impl.BookDaoImpl;
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
	// private BookDao demoDao = new BookDaoImpl();
	private BookDao demoDao;
	private BookService demoService = new BookServiceImpl();

	@Override
	public void show2() {
		System.out.println("我是show2");
		demoDao.show();
	}
	public void setDemoDao(BookDao bookDao){
		this.demoDao=bookDao;
	}

}
