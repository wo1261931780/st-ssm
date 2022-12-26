package com.stssm.github.io.junw.bbb010spring20221220.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb010spring20221220.config
 *
 * @author liujiajun_junw
 * @Date 2022-12-08-36  星期三
 * @description
 */
@Configuration
@ComponentScan("com.stssm.github.io.junw.bbb010spring20221220")
@PropertySource("classpath:jdbc1221.properties")
@Import({jdbc1221Configuration001.class})
public class Spring1221Configuration001 {
}
