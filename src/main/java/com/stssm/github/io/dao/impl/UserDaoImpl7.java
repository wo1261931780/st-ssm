package com.stssm.github.io.dao.impl;

import com.stssm.github.io.dao.UserDao7;
import org.springframework.stereotype.Component;



/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-12  星期四
 * @description
 */
@Component("我是dao的实现类")
public class UserDaoImpl7 implements UserDao7 {
	// component内部其实有一个value属性
	// 这里是可以不写的


	/**
	 * 我是测试方法
	 */
	@Override
	public void show() {
		System.out.println("我是dao7测试方法");
	}
}
