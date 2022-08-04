package com.stssm.github.io.dao.impl;

import com.stssm.github.io.dao.UserDao8;
import org.springframework.stereotype.Repository;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-12  星期四
 * @description
 */
@Repository
public class UserDaoImpl8 implements UserDao8 {
	// @Repository("demo")
	// 如果我在注解里面写了名称，那么就可以按照名称来访问
	// 具体是在运行类中有不同体现


	/**
	 * 我是测试方法
	 */
	@Override
	public void show() {
		System.out.println("我是dao8测试方法");
	}
}
