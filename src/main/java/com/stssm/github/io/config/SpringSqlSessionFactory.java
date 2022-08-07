package com.stssm.github.io.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-13-54  星期日
 * @description 配置SQLsession的工厂方法
 */
@Configuration
public class SpringSqlSessionFactory {

	@Bean
	public SqlSessionFactoryBean getSqlSessionFactory(DruidDataSource dataSource) {
		// 我们如果直接创建SqlSessionFactory这个类
		// 就需要像xml一样，配置所有需要的内容
		// 整合以后，完全不需要这么麻烦
		SqlSessionFactoryBean demo = new SqlSessionFactoryBean();
		demo.setDataSource(dataSource);// 根据上面的自动装配，这里直接添加一个dataSource就可以
		// 其实还有一个事物处理的内容：
		// <properties resource="jdbc.properties"></properties>
		// 这个事物处理，我们后面继续内容

		return demo;
	}

	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer x = new MapperScannerConfigurer();
		x.setBasePackage("com.github.io.dao2");
		return x;
	}
}
