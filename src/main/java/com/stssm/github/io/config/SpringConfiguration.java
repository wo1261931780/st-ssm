package com.stssm.github.io.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.config
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-16  星期五
 * @description
 */
@Configuration
@ComponentScan({"com.stssm.github.io.dao", "com.stssm.github.io.service","com.stssm.github.io.dao2"})
public class SpringConfiguration {
	// 加上指定的注解，代表是个配置类
	// 注解的作用，是替换已经存在的xml配置文件
	// 省略了配置的过程，开发更加简单
	// 上面可以看到，一次性配置了多个类


}
