package com.stssm.github.io.junw.bbb007spring20220806;

import com.stssm.github.io.config.SpringConfiguration2;
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

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration2.class);
		DataSource bean = ctx.getBean(DataSource.class);
		// 这里比较奇妙，直接写获取数据库对象就可以
		// 不需要写ctx.getDruid();然后直接拿到对应的
		System.out.println(bean);
		// 2022年9月7日23:03:22中秋放假回家
		// 最近工作一直在摸鱼，不过事情也确实多，一直没有学习，回家以后先解决这个问题
		// 2022年9月8日21:09:49，今天在重装系统
		// 2022年9月9日23:49:45，同学聚会，初恋结束
	}
}
