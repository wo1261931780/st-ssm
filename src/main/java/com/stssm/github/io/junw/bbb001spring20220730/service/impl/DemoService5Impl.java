package com.stssm.github.io.junw.bbb001spring20220730.service.impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao5;
import com.stssm.github.io.junw.bbb001spring20220730.dao.impl.DemoDao5Impl;
import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService5;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-03  星期日
 * @description
 */
public class DemoService5Impl implements DemoService5 {
	/**
	 * 测试方法
	 */
	private DemoDao5 serviceDemoDao5;

	/**
	 * 测试方法
	 */
	public void setServiceDemoDao5(DemoDao5Impl innerDemoDao5) {
		this.serviceDemoDao5 = innerDemoDao5;
	}

	/**
	 * 测试方法
	 */
	@Override
	public void servieShow5() {
		demorun.debug("我是service中的show5方法");
		demorun.debug("我是service中的Dao5对象：" + serviceDemoDao5);
		demorun.debug("开始调用Dao中的show方法：--------------------------------------");
		serviceDemoDao5.show5();
	}
}
