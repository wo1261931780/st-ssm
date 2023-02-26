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
		String format = String.format("我是dao5构造方法，地址为：%s", this);
		demorun.debug(format);
		// dao中的构造方法是这样的
		// 同时,因为是构造方法,我们也可以通过修改private的方式,将其变成一个私有的
		// 而且,spring创建对象的时候,默认都是调用无参构造方法
	}

	/**
	 *
	 */
	@Override
	public void show5() {
		demorun.debug("我是dao方法中的show5");
	}
}
