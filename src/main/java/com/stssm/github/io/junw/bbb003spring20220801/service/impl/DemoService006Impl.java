package com.stssm.github.io.junw.bbb003spring20220801.service.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao006;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService006;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-07-50  星期五
 * @description
 */
public class DemoService006Impl implements DemoService006 {
	/**
	 * 测试方法
	 */
	private DemoDao006 xmlDemoDao006;

	/**
	 * 测试方法
	 */
	public void setXmlDemoDao006(DemoDao006 xmlDemoDao006) {
		this.xmlDemoDao006 = xmlDemoDao006;
	}

	/**
	 * 测试方法
	 */
	@Override
	public void service006Show() {
		System.out.println("我是service006show方法");
		System.out.println("我是dao6中的show方法");
		xmlDemoDao006.dao006Show();
	}
}
