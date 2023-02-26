package com.stssm.github.io.junw.bbb019spring20230108.configuration;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
/**
 * @author junw
 */
public class Mybatis0108Configuration001 {


	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setTypeAliasesPackage("com.stssm.github.io.junw.bbb019spring20230108.domain");
		return sqlSessionFactory;
	}

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer(){
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.stssm.github.io.junw.bbb019spring20230108.dao");
		// 这里配置好了扫描包以后，dao中就不需要重新设置impl
		return mapperScannerConfigurer;
	}
}
