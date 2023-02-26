package com.stssm.github.io.junw.bbb012spring20221229.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229.config
 *
 * @author liujiajun_junw
 * @Date 2022-12-18-25  星期四
 * @description
 */
public class Mybatis1229Configuration {
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setTypeAliasesPackage("com.stssm.github.io.junw.bbb012spring20221229.dao.impl");
		factoryBean.setDataSource(dataSource);
		return factoryBean;
	}

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.stssm.github.io.junw.bbb012spring20221229.dao.impl");
		return mapperScannerConfigurer;
	}
}
