package com.stssm.github.io.junw.bbb006spring20220805.dao.impl;

import com.stssm.github.io.junw.bbb006spring20220805.dao.Demo0805Dao002;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao2.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-55  星期五
 * @description
 */
@Repository
@Scope("prototype")
public class Demo0805Dao002Impl implements Demo0805Dao002 {
	// 记得配置仓库的注解
	// @Scope("singleton")// 单例
	// 同时，如果要修改为非单例创建
	// 在scope中直接添加一个prototype就可以

	/**
	 * 我是测试
	 */
	@Override
	public void demo0805Dao002Show() {
		System.out.println("我是Demo0805Dao002Impl中的demo0805Dao002Show方法");
	}

	@PostConstruct
	public void initLife() {
		// 注解的直译：在构造之前
		System.out.println("Demo0805Dao002Impl中的初始化方法");
	}

	@PreDestroy
	public void destroyLife() {
		// 注解直译：在销毁之前
		System.out.println("Demo0805Dao002Impl中的销毁方法");
	}


}
