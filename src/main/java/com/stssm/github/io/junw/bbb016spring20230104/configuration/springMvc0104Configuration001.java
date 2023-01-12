package com.stssm.github.io.junw.bbb016spring20230104.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * @author junw
 */
@Configuration
@ComponentScan({"com.stssm.github.io.junw.bbb016spring20230104.controller"})
@EnableWebMvc
public class springMvc0104Configuration001 {
	// @EnableWebMvc
	// 开启由json数据转化为对象的功能

}
