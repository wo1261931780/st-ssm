package com.stssm.github.io.junw.bbb008spring20220807;

import com.stssm.github.io.config.SpringConfiguration4;
import com.stssm.github.io.domain.Account;
import com.stssm.github.io.service.UserService4;
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
public class Bbb014 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration4.class);
		UserService4 bean = ctx.getBean(UserService4.class);
		// bean.show();
		Account account = bean.selectById(2);
		System.out.println("我是SQL找到的对象：" + account);

	}
}
