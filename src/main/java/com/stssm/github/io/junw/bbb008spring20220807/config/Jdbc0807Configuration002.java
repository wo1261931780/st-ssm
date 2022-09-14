package com.stssm.github.io.junw.bbb008spring20220807.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;

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

public class Jdbc0807Configuration002 {
	// 需要注意的是：
	// 如果上面已经添加了Configuration
	// 外部就不能添加包扫描器

	@Bean
	public DataSource getDruid() {
		DruidDataSource demoBean = new DruidDataSource();
		demoBean.setDriverClassName("com.mysql.jdbc.Driver");
		demoBean.setUrl("jdbc:mysql://localhost:3306/study002jdbc");
		demoBean.setUsername("root");
		demoBean.setPassword("LIU18959297292");
		return demoBean;
	}
}
