package com.stssm.github.io.service.impl;

import com.stssm.github.io.dao.BookDao;
import com.stssm.github.io.dao.userDao;
import com.stssm.github.io.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
	/**
	 * 这里使用实现的方式，完成生命周期的测试
	 * 左上角出现的小图标，对应的就是后面的spring配置出来的xml
	 * private BookDao serviceDao = new BookDaoImpl();
	 */
	private BookDao serviceDao;
	/**
	 * private BookService serviceObj = new BookServiceImpl();
	 */
	private userDao serviceUserDao;

	/**
	 * 测试方法
	 */
	@Override
	public void serviceShow() {
		System.out.println("我是serviceShow");
		serviceDao.daoShow();
	}

	public void setXmlServiceDao(BookDao xmlServiceDao) {
		System.out.println("我是service最先完成的初始化过程");

		this.serviceDao = xmlServiceDao;
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是service的初始化过程");

	}

	/**
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("实现类完成销毁展示");

	}

	public void setXmlServiceDaoUser(userDao xmlServiceDaoUser) {
		this.serviceUserDao = xmlServiceDaoUser;
	}
}
