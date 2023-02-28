package com.stssm.github.io.junw.bbb008spring20220807;

import com.stssm.github.io.junw.bbb008spring20220807.config.Spring0807Configuration003;
import com.stssm.github.io.junw.bbb008spring20220807.config.Spring0807Configuration004;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb008spring20220807
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-33  星期日
 * @description
 */
public class Bbb029 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0807Configuration003.class);
		DataSource bean = ctx.getBean(DataSource.class);
		String format = String.format("我是扫描得到的对象：%s", bean);
		demorun.debug(format);
		demorun.debug("***********************************************************");
		ApplicationContext ctx004 = new AnnotationConfigApplicationContext(Spring0807Configuration004.class);
		DataSource bean004 = ctx004.getBean(DataSource.class);
		String format1 = String.format("我是扫描得到的对象：%s", bean004);
		demorun.debug(format1);
	}
}