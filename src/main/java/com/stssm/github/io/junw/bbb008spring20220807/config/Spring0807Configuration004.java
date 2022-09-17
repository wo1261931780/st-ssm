package com.stssm.github.io.junw.bbb008spring20220807.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-09-16  星期六
 * @description
 */
@Configuration
public class Spring0807Configuration004 {

	/*
	 * 在不考虑导入外部jdbc配置的情况下，
	 * 还有一种简单类型的注入
	 * 将所有的数据，保存到变量中，然后再次赋值就可以
	 * ======================================
	 * 简单类型的配置，本质上是为了补充原来没有配置完成的参数
	 */

	@Value("jdbc:mysql://localhost:3306/study002jdbc")
	private String url;
	@Value("root")
	private String account;
	@Value("LIU18959297292")
	private String paw;

	// 使用简单类型的变量，来补充数据库连接池中设置的属性

	@Bean
	public DataSource dataSource() {
		DruidDataSource demo = new DruidDataSource();
		demo.setUsername(account);
		demo.setPassword(paw);
		demo.setUrl(url);
		return demo;
	}
	// 上面其实都是简单类型的注入
	// 只要我设置了变量和对应的变量值，那么注入会自动完成
}
