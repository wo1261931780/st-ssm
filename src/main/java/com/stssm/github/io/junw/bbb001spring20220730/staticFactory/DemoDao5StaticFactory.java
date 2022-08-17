package com.stssm.github.io.junw.bbb001spring20220730.staticFactory;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao5;
import com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.DemoDao5Impl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.staticFactory.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-50  星期日
 * @description
 */
public class DemoDao5StaticFactory {
	public static DemoDao5 getDemoDao5() {
		System.out.println("我是静态工厂，调用方法，可以直接新建一个DemoDao5对象");
		return new DemoDao5Impl();
	}
}
