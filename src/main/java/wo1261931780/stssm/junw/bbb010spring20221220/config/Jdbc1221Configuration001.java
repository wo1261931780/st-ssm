package com.stssm.github.io.junw.bbb010spring20221220.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb010spring20221220.config
 *
 * @author liujiajun_junw
 * @Date 2022-12-14-42  星期一
 * @description
 */
public class Jdbc1221Configuration001 {

	@Value("${jdbc1221.driver}")
	private String driver;
	@Value("${jdbc1221.url}")
	private String url;
	@Value("${jdbc1221.userName}")
	private String userName;
	@Value("${jdbc1221.password}")
	private String password;

	@Bean
	public DataSource dataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setDriverClassName(driver);
		druidDataSource.setUrl(url);
		druidDataSource.setUsername(userName);
		druidDataSource.setPassword(password);
		return druidDataSource;
	}

}
