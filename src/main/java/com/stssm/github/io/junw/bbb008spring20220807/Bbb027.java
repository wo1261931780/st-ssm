package com.stssm.github.io.junw.bbb008spring20220807;

import com.stssm.github.io.junw.bbb008spring20220807.config.Spring0807Configuration001;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806
 *
 * @author liujiajun_junw
 * @Date 2022-08-09-06  星期六
 * @description
 */
public class Bbb027 {
	public static void main(String[] args) {
		System.out.println("我是测试装载外部bean对象的运行类");

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0807Configuration001.class);
		DataSource bean = ctx.getBean(DataSource.class);
		// 这里比较奇妙，直接写获取数据库对象就可以
		// 不需要写ctx.getDruid();然后直接拿到对应的
		System.out.println(bean);
	}
}
