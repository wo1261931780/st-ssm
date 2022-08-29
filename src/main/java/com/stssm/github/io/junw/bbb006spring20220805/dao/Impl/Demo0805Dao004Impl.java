package com.stssm.github.io.junw.bbb006spring20220805.dao.Impl;

import com.stssm.github.io.junw.bbb006spring20220805.dao.Demo0805Dao004;
import org.springframework.beans.factory.annotation.Value;
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
@Repository("Demo0805Dao004Impl")
@Scope("prototype")
public class Demo0805Dao004Impl implements Demo0805Dao004 {

	@Value("123")
	private int age;
	@Value("${jdbc.url}")
	private String name;
	// 使用注解定义变量的值，好处在于，可以直接加载外部的文件，然后拿到文件中的属性值


	/**
	 * 我是测试
	 */
	@Override
	public void demo0805Dao004Show() {
		System.out.println("我是spring dao3中的show方法");
		System.out.println("我是name：" + name);
	}

	@PostConstruct
	public void initLife() {
		// 注解的直译：在构造之前
		System.out.println("SpringDao3中的初始化方法");
	}

	@PreDestroy
	public void destroyLife() {
		// 注解直译：在销毁之前
		System.out.println("SpringDao3中的销毁方法");
	}


}
