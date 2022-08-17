package com.stssm.github.io.junw.bbb001spring20220730.Factory;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao6;
import com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.DemoDao6Impl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.dao.Factory
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-14  星期日
 * @description
 */
public class DemoDao6Factory {
	public DemoDao6 getDemoDao6() {
		System.out.println("我是实例工厂中获取Dao6的方法");
		return new DemoDao6Impl();
	}
}
