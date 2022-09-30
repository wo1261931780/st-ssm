package com.stssm.github.io.junw.bbb004spring20220802.dao.impl;

import com.stssm.github.io.junw.bbb004spring20220802.dao.Demo0802Dao001;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-18  星期四
 * @description
 */
public class Demo0802DaoImpl001 implements Demo0802Dao001 {
	private String demo0802DaoImplName;

	public void setDemo0802DaoImplName(String demo0802DaoImplName) {
		this.demo0802DaoImplName = demo0802DaoImplName;
	}

	//	/**
//	 *
//	 */
//	@Override
	public void daoShow001() {
		demorun.debug("我是Demo0802Dao中的show方法");
		String format = String.format("我是Demo0802Dao中的变量%s", demo0802DaoImplName);
		demorun.debug(format);
	}
}
