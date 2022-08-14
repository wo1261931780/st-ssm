package com.stssm.github.io.junw.bbb001spring20220730.service.Impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao3;
import com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.DemoDao3Impl;
import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService3;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-03  星期日
 * @description
 */
public class DemoService3Impl implements DemoService3 {

	private DemoDao3 serviceDemoDao3;

	public void setServiceDemoDao3(DemoDao3Impl innerDemoDao3) {
		this.serviceDemoDao3 = innerDemoDao3;
	}

	/**
	 *
	 */
	@Override
	public void servieShow3() {
		System.out.println("我是service中的show3方法");
		System.out.println("我是service中的Dao对象：" + serviceDemoDao3);
		System.out.println("开始调用Dao中的show方法：--------------------------------------");
		serviceDemoDao3.show3();
	}
}
