package com.stssm.github.io.junw.bbb001spring20220730.dao.Impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao6;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-16-02  星期日
 * @description
 */
public class DemoDao6Impl implements DemoDao6 {

	public DemoDao6Impl() {
		System.out.println("我是dao6构造方法，地址为：" + this);
	}

	/**
	 *
	 */
	@Override
	public void show6() {
		System.out.println("我是dao方法中的show6");
	}
}
