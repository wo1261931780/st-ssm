package com.stssm.github.io.junw.bbb004spring20220802.dao.Impl;

import com.stssm.github.io.junw.bbb004spring20220802.dao.Demo0802Dao002;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-18  星期四
 * @description
 */
public class Demo0802DaoImpl002 implements Demo0802Dao002 {
	private String Demo0802DaoImplName;

	public Demo0802DaoImpl002(String demo0802DaoImplName) {
		Demo0802DaoImplName = demo0802DaoImplName;
		System.out.println("我是带参构造方法");
	}

	public Demo0802DaoImpl002() {
		System.out.println("我是无参构造方法");
	}

	public void setDemo0802DaoImplName(String demo0802DaoImplName) {
		this.Demo0802DaoImplName = demo0802DaoImplName;
	}

	/**
	 *
	 */
	@Override
	public void daoShow002() {
		System.out.println("我是Demo0802Dao中的show方法");
		System.out.println("我是Demo0802Dao中的变量" + Demo0802DaoImplName);
	}
}