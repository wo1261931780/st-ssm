package com.stssm.github.io.junw.bbb003spring20220801.service.Impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao005;
import com.stssm.github.io.junw.bbb003spring20220801.dao.Impl.DemoDao005Impl;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService004;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-07-50  星期五
 * @description
 */
public class DemoService004Impl implements DemoService004 {


	private DemoDao005 demoDao005;

	/**
	 *
	 */
	@Override
	public void service004Show() {
		System.out.println("我是service004show方法");
		System.out.println("我是dao4中的show方法");
		demoDao005.dao005Show();
	}

	public void setDemoDao005(DemoDao005Impl demoDao005) {
		System.out.println("我是set方法，通过按照类型装配完成了demoDao4对象的依赖注入");
		this.demoDao005 = demoDao005;
	}
}
