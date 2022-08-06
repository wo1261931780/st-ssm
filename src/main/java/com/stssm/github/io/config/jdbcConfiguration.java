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
public class jdbcConfiguration {

	/**
	 * 这里是一个设计模式，我们一般将专门管理一类对象的bean，丢到同一个位置
	 * 同时，为了能够扫描到其它类中的对象，我们会在一个统一的类中，设置componentScanner，
	 * 从而实现，加载一个类，扫描到配置文件包下的所有类
	 */
	@Bean
	public DataSource getDruid() {
		// 这里需要添加一个bean的注解，代表我返回的是一个对象
		DruidDataSource demoBean = new DruidDataSource();
		// 如果这样考虑，那么在对应的jar包中，也都提供了内部的构造方法
		demoBean.setDriverClassName("com.mysql.jdbc.Driver");
		demoBean.setUrl("jdbc:mysql://localhost:3306/study002jdbc");
		demoBean.setUsername("root");
		demoBean.setPassword("LIU18959297292");
		return demoBean;
	}


}
