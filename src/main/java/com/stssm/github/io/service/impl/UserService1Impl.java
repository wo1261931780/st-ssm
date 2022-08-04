package com.stssm.github.io.service.impl;

import com.stssm.github.io.dao.UserDao6;
import com.stssm.github.io.service.UserService1;
import org.springframework.stereotype.Component;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.service.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-13  星期四
 * @description
 */
@Component
public class UserService1Impl implements UserService1 {
	private UserDao6 serviceUserDao6;

	public void setServiceuserDao6(UserDao6 userDao6){
		this.serviceUserDao6 = userDao6;
	}



	/**
	 * 我是service方法
	 */
	@Override
	public void show() {
		System.out.println("我是service中的show方法");
		serviceUserDao6.show();
	}
}
