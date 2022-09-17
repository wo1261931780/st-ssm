package com.stssm.github.io.junw.bbb008spring20220807.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.stssm.github.io.junw.bbb006spring20220805.dao.Demo0805Dao004;
import org.springframework.context.annotation.Bean;
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
public class Spring0807Configuration005 {
	// =============================================
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
		// mybatis，实际上是管理SQLsessionFactory对象
		return new DruidDataSource();
	}

}
