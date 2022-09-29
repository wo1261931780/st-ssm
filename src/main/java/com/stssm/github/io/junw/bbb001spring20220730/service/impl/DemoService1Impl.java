package com.stssm.github.io.junw.bbb001spring20220730.service.impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao1;
import com.stssm.github.io.junw.bbb001spring20220730.dao.impl.DemoDao1Impl;
import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService1;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-03  星期日
 * @description
 */
public class DemoService1Impl implements DemoService1 {
	private final DemoDao1 demoDao1 = new DemoDao1Impl();

	/**
	 *
	 */
	@Override
	public void serviceShow() {
		demorun.debug("我是demoService中的show方法");
		demorun.debug(demoDao1);
		demorun.debug(demoDao1 + "调用了dao中的show方法");
		demoDao1.show();
	}
}
