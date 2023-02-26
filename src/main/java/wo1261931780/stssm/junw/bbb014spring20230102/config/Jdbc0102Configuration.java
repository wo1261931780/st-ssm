package com.stssm.github.io.junw.bbb014spring20230102.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @author junw
 */
public class Jdbc0102Configuration {
	// 底下配置了jdbc的参数和mybatis的参数，否则不能生效

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		// transactionManager(DataSource dataSource) {
		// 这里实际上是使用spring中的bean注入的方式完成操作
		// 实际上是新建了一个事物管理器
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		// 这里使用的是jdbc的接口
		// 上面返回的事务不能修改，底下这个是可以改动的
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}
}
