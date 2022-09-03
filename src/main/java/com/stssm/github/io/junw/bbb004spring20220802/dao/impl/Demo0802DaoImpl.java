package com.stssm.github.io.junw.bbb004spring20220802.dao.impl;

import com.stssm.github.io.junw.bbb004spring20220802.dao.Demo0802Dao;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-18  星期四
 * @description
 */
public class Demo0802DaoImpl implements Demo0802Dao {
	private String demo0802DaoImplName;

	public void setDemo0802DaoImplName(String demo0802DaoImplName) {
		this.demo0802DaoImplName = demo0802DaoImplName;
	}

	/**
	 *
	 */
	@Override
	public void daoShow() {
		System.out.println("我是Demo0802Dao中的show方法");
		System.out.println("我是Demo0802Dao中的变量" + demo0802DaoImplName);
	}
}
