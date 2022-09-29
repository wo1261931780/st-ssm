package com.stssm.github.io.junw.bbb002spring20220731.service.impl;

import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao001;
import com.stssm.github.io.junw.bbb002spring20220731.dao.impl.UserDao001Impl;
import com.stssm.github.io.junw.bbb002spring20220731.service.UserService001;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

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
	/**
	 * 依赖注入
	 */
	private UserDao001 serviceUserDao001;

	/**
	 * 测试方法
	 */

	public void setDiUserDao001(UserDao001Impl diUserDao001) {
		demorun.debug("已经完成了UserService001Impl中对UserDao001Impl的依赖注入");
		this.serviceUserDao001 = diUserDao001;
	}

	/**
	 * 测试方法
	 */
	@Override
	public void serviceShow() {
		demorun.debug("我是UserService001中的show方法");
	}

	/**
	 * 完成初始化
	 */

	public void initTest1() {
		demorun.debug("我是serviceDao1中的初始化方法");
	}

	/**
	 * 完成销毁方法
	 */

	public void destoryTest1() {
		demorun.debug("我是serviceDao1中的销毁方法");
	}
}
