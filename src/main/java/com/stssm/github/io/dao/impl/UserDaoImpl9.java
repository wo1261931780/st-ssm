package com.stssm.github.io.dao.impl;

import com.stssm.github.io.dao.UserDao9;
import org.springframework.stereotype.Repository;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-34  星期五
 * @description
 */
@Repository
public class UserDaoImpl9 implements UserDao9 {

	/**
	 * 测试方法
	 */
	@Override
	public void show() {
		System.out.println("我是dao中show方法，UserDao9");
	}
}
