package com.stssm.github.io.junw.bbb002spring20220731.dao.impl;

import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao001;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-05  星期日
 * @description
 * @return
 * @exception
 */
public class UserDao001Impl implements UserDao001, InitializingBean, DisposableBean {


	/**
	 *
	 */
	@Override
	public void destroy() {
		demorun.debug("我是UserDao001销毁方法");
	}

	/**
	 *
	 */
	@Override
	public void afterPropertiesSet() {
		demorun.debug("我是UserDao001初始化方法");

	}

	/**
	 * 展示结果
	 */
	@Override
	public void userDaoShow001() {
		demorun.debug("我是UserDao001中的构造方法");
	}
}
