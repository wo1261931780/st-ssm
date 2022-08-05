package com.stssm.github.io.junw.bbb006spring20220805;

import com.stssm.github.io.config.SpringConfiguration;
import com.stssm.github.io.dao2.impl.SpringDaoImpl1;
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
public class Bbb010 {
	public static void main(String[] args) {
		System.out.println("我是新的对象");
		// ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		// 如果直接用上面这个，是不能进行手动关闭的
		// 同样的，销毁方法也是无法使用的
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SpringDaoImpl1 bean = ctx.getBean(SpringDaoImpl1.class);
		SpringDaoImpl1 bean2 = ctx.getBean(SpringDaoImpl1.class);
		System.out.println(bean);
		// com.stssm.github.io.dao2.impl.SpringDaoImpl1@b62d79
		System.out.println("----------------------------------------------");
		System.out.println(bean2);
		// com.stssm.github.io.dao2.impl.SpringDaoImpl1@6631f5ca
		ctx.close();




	}
}
