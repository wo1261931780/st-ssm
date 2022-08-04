package com.stssm.github.io.dao.impl;

import com.stssm.github.io.dao.UserDao2;
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
public class UserDaoImpl3 implements UserDao2, InitializingBean, DisposableBean {

	private int nums;
	private String resultStr;



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
}
