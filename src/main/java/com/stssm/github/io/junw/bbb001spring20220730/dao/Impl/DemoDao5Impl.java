package com.stssm.github.io.junw.bbb001spring20220730.dao.Impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao5;

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
		System.out.println("我是dao5构造方法，地址为：" + this);
	}

	/**
	 *
	 */
	@Override
	public void show5() {
		System.out.println("我是dao方法中的show5");
	}
}
