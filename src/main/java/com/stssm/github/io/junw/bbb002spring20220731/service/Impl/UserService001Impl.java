package com.stssm.github.io.junw.bbb002spring20220731.service.Impl;

import com.stssm.github.io.junw.bbb002spring20220731.dao.Impl.UserDao001Impl;
import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao001;
import com.stssm.github.io.junw.bbb002spring20220731.service.UserService001;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-08-04  星期二
 * @description
 */
public class UserService001Impl implements UserService001 {
	// --注释掉检查 START (2022-09-01 12:48):
//	/**
//	 * 依赖注入
//	 */
	private UserDao001 serviceUserDao001;
// --注释掉检查 STOP (2022-09-01 12:48)

	public void setDiUserDao001(UserDao001Impl diUserDao001) {
		System.out.println("已经完成了UserService001Impl中对UserDao001Impl的依赖注入");
		this.serviceUserDao001 = diUserDao001;
	}

	/**
	 *
	 */
	@Override
	public void serviceShow() {
		System.out.println("我是UserService001中的show方法");
	}

	public void initTest1() {
		System.out.println("我是serviceDao1中的初始化方法");
	}

	public void destoryTest1() {
		System.out.println("我是serviceDao1中的销毁方法");
	}
}
