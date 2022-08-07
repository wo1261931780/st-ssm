package com.stssm.github.io.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-13-42  星期日
 * @description 扫描内部的配置信息
 */
@Configuration
@ComponentScan({"com.stssm.github.io.dao2", "com.stssm.github.io.service"})
@PropertySource("jdbc4.properties")
public class SpringConfiguration4 {

	// @Bean
	// public DataSource dataSource(SpringDao4 springDao4) {
	// 	// 这里是按照类型去寻找的，不是按照字节码文件
	// 	System.out.println("我是springDao4：" + springDao4);
	// 	// 这里，首先自动装配，获取了一个springDao4
	// 	// 然后又新建了一个德鲁伊数据源
	// 	DruidDataSource x = new DruidDataSource();
	// 	// mybatis，实际上是管理SQLsessionFactory对象
	// 	return x;
	// }


}
