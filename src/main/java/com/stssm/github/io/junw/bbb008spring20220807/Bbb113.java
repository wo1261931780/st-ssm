package com.stssm.github.io.junw.bbb008spring20220807;

import com.stssm.github.io.config.SpringConfiguration3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb008spring20220807
 *
 * @author liujiajun_junw
 * @Date 2022-08-12-39  星期日
 * @description
 */
public class Bbb113 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration3.class);
		DataSource bean = ctx.getBean(DataSource.class);
		// 这里如果配置了多个datasource类，会出现报错
		// 因为默认是单例对象
		System.out.println(bean);


	}
}
