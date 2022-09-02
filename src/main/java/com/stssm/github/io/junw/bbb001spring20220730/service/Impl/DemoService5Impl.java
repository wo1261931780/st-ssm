package com.stssm.github.io.junw.bbb001spring20220730.service.Impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao5;
import com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.DemoDao5Impl;
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

	private DemoDao5 serviceDemoDao5;

	// --注释掉检查 START (2022-09-01 12:48):
	public void setServiceDemoDao5(DemoDao5Impl innerDemoDao5) {
		this.serviceDemoDao5 = innerDemoDao5;
	}
// --注释掉检查 STOP (2022-09-01 12:48)

	/**
	 *
	 */
	@Override
	public void servieShow5() {
		System.out.println("我是service中的show5方法");
		System.out.println("我是service中的Dao5对象：" + serviceDemoDao5);
		System.out.println("开始调用Dao中的show方法：--------------------------------------");
		serviceDemoDao5.show5();
	}
}
