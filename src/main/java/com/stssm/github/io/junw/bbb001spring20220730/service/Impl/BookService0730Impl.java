package com.stssm.github.io.junw.bbb001spring20220730.service.Impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.BookDao0730;
import com.stssm.github.io.dao.UserDao;
import com.stssm.github.io.junw.bbb001spring20220730.service.BookService0730;
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
public class BookService0730Impl implements BookService0730, InitializingBean, DisposableBean {
	/**
	 * 这里使用实现的方式，完成生命周期的测试
	 * 左上角出现的小图标，对应的就是后面的spring配置出来的xml
	 * private BookDao0730 serviceDao = new BookDao0730Impl();
	 */
	private BookDao0730 serviceDao;// 最大的区别在于这里，通过IoC管理以后，这里不需要重新new 一个对象出来

	private UserDao serviceUserDao;
	/**
	 * 测试方法
	 */
	@Override
	public void serviceShow() {
		System.out.println("我是serviceShow");
		serviceDao.daoShow();
	}

	public void setXmlServiceDao(BookDao0730 xmlServiceDao) {
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

	public void setXmlServiceDaoUser(UserDao xmlServiceDaoUser) {
		this.serviceUserDao = xmlServiceDaoUser;
	}
}
