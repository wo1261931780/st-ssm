package com.stssm.github.io.junw.bbb007spring20220806;

import com.stssm.github.io.junw.bbb007spring20220806.config.Spring0806Config;
import com.stssm.github.io.junw.bbb007spring20220806.service.impl.Demo0806Service003Impl;
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
public class Bbb025 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0806Config.class);
		Demo0806Service003Impl bean = ctx.getBean(Demo0806Service003Impl.class);
		System.out.println("我是运行类" + bean);
		bean.demo0806Service003Show();
	}
}
