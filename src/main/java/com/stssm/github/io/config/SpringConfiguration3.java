package com.stssm.github.io.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.stssm.github.io.junw.bbb006spring20220805.dao.Demo0805Dao004;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
@ComponentScan({"com.stssm.github.io.dao2"})
public class SpringConfiguration3 {
	// 为了能够加载到其它包下面的类，就需要像上面一样，
	// @ComponentScan("com.stssm.github.io.config")	设置一个包扫描器
	// 但是这样不太直观地看出到底管理了哪些内容
	// 我们可以直接在上面使用包导入的方式，来添加我们需要管理的内容

	/**
	 * 还有一种简单类型的注入
	 */
	@Value("jdbc:mysql://localhost:3306/study002jdbc")
	private String url;
	@Value("root")
	private String account;
	@Value("LIU18959297292")
	private String paw;


	// @Bean
	// public DataSource dataSource() {
	// 	DruidDataSource demo = new DruidDataSource();
	// 	demo.setUsername(account);
	// 	demo.setPassword(paw);
	// 	demo.setUrl(url);
	// 	return demo;
	// }

	// 上面其实都是简单类型的注入
	// 只要我设置了变量和对应的变量值，那么注入会自动完成
	// 接下来是引用类型
	// 首先需要设置扫描器，只要扫描可以找到对应的类
	// 那么容器加载的时候，就会自动将类进行装配的操作
	// 如果上面已经导入了对应的类，那么底下的注入就会自动进行

	@Bean
	public DataSource dataSource(Demo0805Dao004 demo0805Dao004) {
		// 这里是按照类型去寻找的，不是按照字节码文件
		System.out.println("我是springDao4：" + demo0805Dao004);
		// 这里，首先自动装配，获取了一个springDao4
		// 然后又新建了一个德鲁伊数据源
		DruidDataSource x = new DruidDataSource();
		// mybatis，实际上是管理SQLsessionFactory对象
		return x;
	}

}
