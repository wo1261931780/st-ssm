package com.stssm.github.io.service.impl;

import com.stssm.github.io.dao2.SpringDao2;
import com.stssm.github.io.service.UserService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.service.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-13  星期四
 * @description
 */
@Service
public class UserService3Impl implements UserService3 {
	/**
	 * 用不同的注解直接说明问题
	 * 数据层就是repository
	 * 接口业务层就是controller
	 * 然后在表现层就是service
	 */
	@Autowired
	@Qualifier("springDao3")
	private SpringDao2 springDao2;
// 这里提示找不到bean，但是运行不会报错
// 	这里就出现了一个问题
// 如果dao的实现类有两个，那么具体注入哪一个？
// 在多个类存在的情况下，直接使用会导致报错
// 	要解决，就需要在repository里面添加一个名称

// 	在@Qualifier("springDao3")中指定任意的名称，只要对应得到repository里面
// 	就可以自动装配
// 	这里具体的变量名称已经不重要，变量代表的是对应装配的对象




	// public void setSpringDao2(SpringDao2 demo) {
	// 	this.springDao2 = demo;
	// }
// 使用自动装配以后，set对我们来说已经不再需要

	/**
	 * 我是service方法
	 */
	@Override
	public void show() {
		System.out.println("我是service3中的show方法");
		springDao2.show();
		System.out.println("现在service调用了springDao2中的show方法");
	}
}
