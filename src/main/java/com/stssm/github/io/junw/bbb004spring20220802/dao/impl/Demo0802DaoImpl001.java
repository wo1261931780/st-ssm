package com.stssm.github.io.junw.bbb004spring20220802.dao.impl;

import com.stssm.github.io.junw.bbb004spring20220802.dao.Demo0802Dao001;

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
	private String Demo0802DaoImplName;

	public void setDemo0802DaoImplName(String demo0802DaoImplName) {
		this.Demo0802DaoImplName = demo0802DaoImplName;
	}

	//	/**
//	 *
//	 */
//	@Override
	public void daoShow001() {
		demorun.debug("我是Demo0802Dao中的show方法");
		demorun.debug("我是Demo0802Dao中的变量" + Demo0802DaoImplName);
	}
}
