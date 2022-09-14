package com.stssm.github.io.junw.bbb008spring20220807.config;

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
@Import({Jdbc0807Configuration002.class})
public class Spring0807Configuration003 {
	// 设置一个包扫描器
	// 但是这样不太直观地看出到底管理了哪些内容
	// 我们可以直接在上面使用Import包导入的方式，来添加我们需要管理的内容
	// 如果要添加多个，就直接使用数组的形式来添加
	// 但是，对于Import进来的参数对象
	// 参数对象中就不能设置Configuration，否则报错
}
