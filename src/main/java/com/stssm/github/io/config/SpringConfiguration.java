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
 * @Date 2022-08-20-16  星期五
 * @description
 */
@Configuration
@ComponentScan({"com.stssm.github.io.dao", "com.stssm.github.io.service", "com.stssm.github.io.dao2"})
@PropertySource({"jdbc2.properties", "jdbc3.properties"})
public class SpringConfiguration {
	// 加上指定的注解，代表是个配置类
	// 注解的作用，是替换已经存在的xml配置文件
	// 省略了配置的过程，开发更加简单
	// 上面可以看到，一次性配置了多个类

	// ___________________________________
	// 使用@PropertySource("jdbc3.properties")，直接获取到对应的配置文件
	// 从而拿到配置文件中的属性值
	// 我们上面，资源的映射路径是一个数组的形式保存的
	// "jdbc3.properties"，注解会将其视为一个文件，然后进行映射
	// 这里如果写了通配符，是不被允许的
	// 具体的源码中有相应的说明，前提是已经下载了源码
	// 源码说明如下：
	// Resource location wildcards (e.g. **/*.properties) are not permitted; each location must evaluate to exactly one .properties or .xml resource.


}
