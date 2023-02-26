package com.stssm.github.io.junw.bbb001spring20220730.dao.impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao4;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-02  星期日
 * @description
 */
public class DemoDao4Impl implements DemoDao4 {
	// private BookDao0730 demoObj = new BookDao0730Impl();
	// 这里不需要这一行代码，否则会不断递归，导致内存溢出

	// 通过构造方法，完成对象实例化

	public DemoDao4Impl() {
		String format = String.format("我是dao4构造方法，地址为：%s", this);
		demorun.debug(format);
		// 这里不管是公有还是私有，都可以打印结果
		// 因为内部是通过反射的方式去实现构造
		// 而且，spring去创建对象的时候，都是使用无参构造的方法
	}

	/**
	 *
	 */
	@Override
	public void show4() {
		demorun.debug("我是dao方法中的show4");
	}
}
