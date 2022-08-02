package com.stssm.github.io.dao.impl;

import com.stssm.github.io.dao.userDao5;
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
public class userDaoImpl5 implements userDao5, InitializingBean, DisposableBean {
	private String demoName;

	/**
	 *
	 */
	@Override
	public void show() {
		System.out.println("我是show方法");
		System.out.println("我是demoName：" + demoName);
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("我是销毁方法");

	}

	/**
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是初始化方法");

	}

	public void setName(String xmlName) {
		this.demoName = xmlName;
	}
}
