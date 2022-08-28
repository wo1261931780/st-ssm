package com.stssm.github.io.junw.bbb006spring20220805;

import com.stssm.github.io.junw.bbb006spring20220805.config.SpringConfiguration0805;
import com.stssm.github.io.junw.bbb006spring20220805.dao.Impl.Demo0805Dao002Impl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb006spring20220805
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-46  星期五
 * @description
 */
public class Bbb021 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration0805.class);
		Demo0805Dao002Impl bean = ctx.getBean(Demo0805Dao002Impl.class);
		Demo0805Dao002Impl bean2 = ctx.getBean(Demo0805Dao002Impl.class);
		System.out.println(bean);
		// com.stssm.github.io.junw.bbb006spring20220805.dao.Impl.Demo0805Dao003Impl@b62d79
		System.out.println("----------------------------------------------");
		System.out.println(bean2);
		// com.stssm.github.io.junw.bbb006spring20220805.dao.Impl.Demo0805Dao003Impl@6631f5ca
		// 上面测试的就是非单例的情况
		ctx.close();
	}
}
