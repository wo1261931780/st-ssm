package com.stssm.github.io.junw.bbb003spring20220801.dao.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao003;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-08  星期四
 * @description
 */
public class DemoDao003Impl implements DemoDao003 {
	private int age;
	private String address;
	// 这里传递的简单类型数据，是在dao中设置的


	/**
	 *
	 */
	@Override
	public void dao003Show() {
		System.out.println("我是Dao003中的show方法");
		System.out.println("传递age值：" + age);
		System.out.println("传递address值：" + address);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
