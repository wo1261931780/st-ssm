package com.stssm.github.io.service.impl;

import com.stssm.github.io.domain.Account;
import com.stssm.github.io.junw.bbb006spring20220805.dao.Demo0805Dao004;
import com.stssm.github.io.service.UserService4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.service.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-31  星期日
 * @description
 */
@Service
public class UserService4Impl implements UserService4 {

	@Autowired
	@Qualifier("demo0805Dao004")
	private Demo0805Dao004 demo0805Dao004;

	/**
	 * 测试方法
	 */
	@Override
	public void show() {
		System.out.println("我是user service 4");

	}

	/**
	 *
	 */
	@Override
	public Account selectById(int id) {
		// return demo0805Dao004.selectById(id);
		return null;
	}
}
