package com.stssm.github.io.junw.bbb007spring20220806;

import com.stssm.github.io.config.SpringConfiguration;
import com.stssm.github.io.service.impl.UserService3Impl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806
 *
 * @author liujiajun_junw
 * @Date 2022-08-08-05  星期六
 * @description
 */
public class Bbb011 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		UserService3Impl bean = ctx.getBean(UserService3Impl.class);
		System.out.println("我是运行类" + bean);
		bean.show();// Cannot invoke "com.stssm.github.io.dao2.SpringDao2.show()" because "this.springDao2" is null
		// 直接使用会导致报错
		// 因为我们业务层的对象，没有进行装配
	}
}
