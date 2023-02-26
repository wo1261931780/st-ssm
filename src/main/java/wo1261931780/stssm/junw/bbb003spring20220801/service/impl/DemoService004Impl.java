package com.stssm.github.io.junw.bbb003spring20220801.service.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao005;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService004;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

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


	private DemoDao005 xmlDemoDao005;
	private DemoDao005 xmlDemoDao006;

	public void setXmlDemoDao005(DemoDao005 xmlDemoDao005) {
		this.xmlDemoDao005 = xmlDemoDao005;
	}

	public void setXmlDemoDao006(DemoDao005 xmlDemoDao006) {
		this.xmlDemoDao006 = xmlDemoDao006;
	}

	/**
	 *
	 */
	@Override
	public void service004Show() {
		demorun.debug("我是service004show方法");
		demorun.debug("我是dao5中的show方法");
		xmlDemoDao005.dao005Show();
		demorun.debug("我是dao6中的show方法");
		xmlDemoDao006.dao005Show();
	}
}
