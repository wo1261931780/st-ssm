package com.stssm.github.io.junw.bbb003spring20220801.service.Impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao006;
import com.stssm.github.io.junw.bbb003spring20220801.service.DemoService006;

// --注释掉检查 START (2022-09-01 12:48):
///**
// * Created by Intellij IDEA.
// * Project:st-ssm.github.io
// * Package:com.stssm.github.io.junw.bbb003spring20220801.service.Impl
// *
// * @author liujiajun_junw
// * @Date 2022-08-07-50  星期五
// * @description
// */
public class DemoService006Impl implements DemoService006 {
	private DemoDao006 xmlDemoDao006;

	//
//// --注释掉检查 START (2022-09-01 12:48):
////	public void setXmlDemoDao006(DemoDao006 xmlDemoDao006) {
////		this.xmlDemoDao006 = xmlDemoDao006;
////	}
//// --注释掉检查 STOP (2022-09-01 12:48)
//
//	/**
//	 *
//	 */
//	@Override
	public void service006Show() {
		System.out.println("我是service006show方法");
// --注释掉检查 STOP (2022-09-01 12:48)
		System.out.println("我是dao6中的show方法");
		xmlDemoDao006.dao006Show();
	}
}
