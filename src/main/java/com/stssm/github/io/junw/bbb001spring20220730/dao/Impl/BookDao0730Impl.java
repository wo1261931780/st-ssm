package com.stssm.github.io.junw.bbb001spring20220730.dao.Impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.BookDao0730;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-15-11  星期六
 * @description
 * @return
 * @exception
 */
public class BookDao0730Impl implements BookDao0730 {
	// private BookDao0730 demoObj = new BookDao0730Impl();
	// 这里不需要这一行代码，否则会不断递归，导致内存溢出

	public BookDao0730Impl() {
		System.out.println("我是dao构造方法，地址为：" + this);
		// 这里不管是公有还是私有，都可以打印结果
		// 因为内部是通过反射的方式去实现构造
		// 而且，spring去创建对象的时候，都是使用无参构造的方法
	}

	@Override
	public void daoShow() {
		System.out.println("我是dao层");
	}

	/**
	 *
	 */
	@Override
	public void daoInit() {
		System.out.println("我是dao初始化过程");
	}

	/**
	 *
	 */
	@Override
	public void daoDestory() {
		System.out.println("我是dao消亡过程");
	}

}
