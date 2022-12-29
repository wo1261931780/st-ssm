package com.stssm.github.io.junw.bbb012spring20221229.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229.config
 *
 * @author liujiajun_junw
 * @Date 2022-12-18-23  星期四
 * @description
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.stssm.github.io.junw.bbb012spring20221229")
public class Spring1229AopConfiguration002 {
	// @Import({Jdbc1229Configuration.class, Mybatis1229Configuration.class})
	// @PropertySource("classpath:jdbc1229.properties")
}
