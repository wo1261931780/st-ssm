package com.stssm.github.io.junw.bbb001spring20220730.dao.impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao5;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-02  星期日
 * @description
 */
public class DemoDao5Impl implements DemoDao5 {

	public DemoDao5Impl() {
		demorun.debug("我是dao5构造方法，地址为：" + this);
	}

	/**
	 *
	 */
	@Override
	public void show5() {
		demorun.debug("我是dao方法中的show5");
	}
}
