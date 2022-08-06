package com.stssm.github.io.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-08-54  星期六
 * @description
 */
@Configuration
public class SpringConfiguration2 {

	/**
	 * 我们之前都是管理内部的对象，只需要扫描就可以
	 * 这里如果要管理第三方的对象，因为是在jar包中的
	 * 所以需要构造的方式去获得
	 */
	@Bean
	public DataSource getDruid() {
		DruidDataSource demoBean = new DruidDataSource();
		// 如果这样考虑，那么在对应的jar包中，也都提供了内部的构造方法
		demoBean.setDriverClassName("com.mysql.jdbc.Driver");
		demoBean.setUrl("jdbc:mysql://localhost:3306/study002jdbc");
		demoBean.setUsername("root");
		demoBean.setPassword("LIU18959297292");
		return demoBean;
	}
}
