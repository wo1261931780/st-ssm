package com.stssm.github.io.junw.bbb002spring20220731.dao.impl;

import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao002;
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
public class UserDao002Impl implements UserDao002, InitializingBean, DisposableBean {


	/**
	 *
	 */
	@Override
	public void destroy() {
		System.out.println("我是UserDao002销毁方法");
	}

	/**
	 *
	 */
	@Override
	public void afterPropertiesSet() {
		System.out.println("我是UserDao002初始化方法");
	}

	/**
	 * 展示结果
	 */
	@Override
	public void userDaoShow002() {
		System.out.println("我是UserDao002中的构造方法");
	}
}
