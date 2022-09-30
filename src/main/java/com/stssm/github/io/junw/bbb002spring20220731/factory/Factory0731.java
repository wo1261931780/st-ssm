package com.stssm.github.io.junw.bbb002spring20220731.factory;

import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao002;
import com.stssm.github.io.junw.bbb002spring20220731.dao.impl.UserDao002Impl;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731.factory
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-47  星期三
 * @description
 */
public class Factory0731 {
	public UserDao002 factoryGetDao001() {
		demorun.debug("已经通过实例工厂Factory0731获得一个UserDao002Impl");
		return new UserDao002Impl();
	}
}
