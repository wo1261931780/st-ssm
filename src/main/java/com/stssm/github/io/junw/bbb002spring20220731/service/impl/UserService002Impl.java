package com.stssm.github.io.junw.bbb002spring20220731.service.impl;

import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao002;
import com.stssm.github.io.junw.bbb002spring20220731.dao.impl.UserDao002Impl;
import com.stssm.github.io.junw.bbb002spring20220731.service.UserService002;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-08-04  星期二
 * @description
 */
public class UserService002Impl implements UserService002 {
	/**
	 * 依赖注入
	 */
	private UserDao002 serviceUserDao002;

	public void setDiUserDao002(UserDao002Impl diUserDao002) {
		System.out.println("已经完成了UserService002Impl中对UserDao002Impl的依赖注入");
		this.serviceUserDao002 = diUserDao002;
	}

	/**
	 * 测试方法
	 */
	@Override
	public void serviceShow() {
		System.out.println("我是UserService002中的show方法");
	}

	/**
	 * 完成初始化
	 */
	public void initTest1() {
		System.out.println("我是serviceDao1中的初始化方法");
	}

	/**
	 * 完成销毁方法
	 */
	public void destoryTest1() {
		System.out.println("我是serviceDao1中的销毁方法");
	}
}
