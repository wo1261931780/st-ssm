package com.stssm.github.io.dao2.impl;

import com.stssm.github.io.dao2.SpringDao2;
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
@Repository("springDao2")
@Scope("prototype")
public class SpringDaoImpl2 implements SpringDao2 {
	// 记得配置仓库的注解
	// 同时，如果要修改为非单例创建
	// 在scope中直接添加一个prototype就可以

	/**
	 * 我是测试
	 */
	@Override
	public void show() {
		System.out.println("我是spring dao2中的show方法");
	}

	@PostConstruct
	public void initLife() {
		// 注解的直译：在构造之前
		System.out.println("SpringDao2中的初始化方法");
	}

	@PreDestroy
	public void destroyLife() {
		// 注解直译：在销毁之前
		System.out.println("SpringDao2中的销毁方法");
	}


}
