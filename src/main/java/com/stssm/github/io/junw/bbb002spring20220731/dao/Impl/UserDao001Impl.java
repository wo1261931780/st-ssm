package com.stssm.github.io.junw.bbb002spring20220731.dao.Impl;

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
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("我是UserDao001销毁方法");
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是UserDao001初始化方法");

	}

	/**
	 * 展示结果
	 */
	@Override
	public void userDaoShow001() {
		System.out.println("我是UserDao001中的构造方法");
	}
}
