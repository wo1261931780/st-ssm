package com.stssm.github.io.junw.bbb019spring20230108.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author junw
 */
public class jdbc0108configuration001 {
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.username}")
	private String userName;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.driver}")
	private String diverClassName;

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(diverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		return dataSource;
	}
	@Bean
	public PlatformTransactionManager platformTransactionManager(DataSource dataSource){
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
}
