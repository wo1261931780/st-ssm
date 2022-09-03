package com.stssm.github.io.junw.bbb003spring20220801.service.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao004;
import com.stssm.github.io.junw.bbb003spring20220801.dao.impl.DemoDao004Impl;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService003;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-07-50  星期五
 * @description
 */
public class DemoService003Impl implements DemoService003 {


	private DemoDao004 demoDao004;

	/**
	 *
	 */
	@Override
	public void service003Show() {
		System.out.println("我是service003show方法");
		System.out.println("我是dao4中的show方法");
		demoDao004.dao004Show();
	}

	public void setDemoDao004(DemoDao004Impl demoDao004) {
		System.out.println("我是set方法，通过按照类型装配完成了demoDao4对象的依赖注入");
		this.demoDao004 = demoDao004;
	}
}
