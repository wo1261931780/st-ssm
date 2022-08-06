package com.stssm.github.io.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
@Import({jdbcConfiguration.class})
public class SpringConfiguration3 {
	// 为了能够加载到其它包下面的类，就需要像上面一样，
	// @ComponentScan("com.stssm.github.io.config")	设置一个包扫描器
	// 但是这样不太直观地看出到底管理了哪些内容
	// 我们可以直接在上面使用包导入的方式，来添加我们需要管理的内容



}
