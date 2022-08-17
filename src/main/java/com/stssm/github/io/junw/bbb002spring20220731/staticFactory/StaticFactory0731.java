package com.stssm.github.io.junw.bbb002spring20220731.staticFactory;

import com.stssm.github.io.junw.bbb002spring20220731.dao.Impl.UserDao002Impl;
import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao002;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731.staticFactory
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-45  星期三
 * @description
 */
public class StaticFactory0731 {
	public static UserDao002 factoryGetDao002() {
		System.out.println("已经通过静态工厂staticFactory0731获得一个UserDao002Impl");
		return new UserDao002Impl();
	}
}
