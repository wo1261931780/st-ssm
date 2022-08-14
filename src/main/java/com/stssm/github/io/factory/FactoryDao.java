package com.stssm.github.io.factory;

import com.stssm.github.io.junw.bbb001spring20220730.dao.BookDao0730;
import com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.BookDao0730Impl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.factory
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-16-28  星期六
 * @description
 * @return
 * @exception
 */
public class FactoryDao {
	public BookDao0730 getBookDao() {
		System.out.println("我是实例工厂，我要新建一个对象");
		return new BookDao0730Impl();
	}
}
