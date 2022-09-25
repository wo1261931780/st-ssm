package com.stssm.github.io.junw.bbb008spring20220807;

import com.stssm.github.io.junw.bbb008spring20220807.config.Spring0807Configuration005;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb008spring20220807
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-33  星期日
 * @description
 */
public class Bbb030 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Spring0807Configuration005.class);
		// DataSource bean = ctx.getBean(DataSource.class);
		// 这里有点不理解
		// 如果我手动获取了一个DataSource对象
		// 那么就会报错，不是单例的，内部已经存在了一个datasource
		System.out.println(ctx);
		// Demo0919Service001 bean = ctx.getBean(Demo0919Service001.class);
		// bean.show();
		// Account account = bean.selectById(2);
		// System.out.println("我是SQL找到的对象：" + account);
	}
}
