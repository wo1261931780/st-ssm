package com.stssm.github.io.junw.bbb019spring20230108.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.stssm.github.io.junw.bbb019spring20230108.service"})
@PropertySource("jdbc20230108.properties")
@Import({jdbc0108configuration001.class, mybatis0108configuration001.class})
@EnableTransactionManagement
public class spring0108configuration001 {
}
