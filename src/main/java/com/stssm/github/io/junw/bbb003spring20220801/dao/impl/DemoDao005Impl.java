package com.stssm.github.io.junw.bbb003spring20220801.dao.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao005;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220801.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-08  星期四
 * @description
 */
public class DemoDao005Impl implements DemoDao005 {
	private int age;
	private String address;


	@Override
	public void dao005Show() {
		System.out.println("我是Dao005中的show方法");
		System.out.println("传递age值：" + age);
		System.out.println("传递address值：" + address);
	}

	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
