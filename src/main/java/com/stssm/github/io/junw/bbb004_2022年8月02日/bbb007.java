package com.stssm.github.io.junw.bbb004_2022年8月02日;

import com.stssm.github.io.dao.userDao5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004_2022年8月02日
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-30  星期二
 * @description
 */
public class bbb007 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb003SpringContext.xml");

		// 如果从文件系统加载容器，就需要指定绝对路径
		// ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\1\\Documents\\GitHub\\st-ssm.github.io\\src\\main\\resources\\bbb003SpringContext.xml");

		// userDao5 userDao5 = (userDao5) ctx.getBean("userDao5");// 第一种
		// userDao5 userDao5 = ctx.getBean("userDao5", userDao5.class);// 第二种
		// 这种带上文件字节码的形式，就不需要进行强转操作
		userDao5 userDao5 =  ctx.getBean(userDao5.class);// 第三种，直接指定
		// 但是这种指定的方式，无法加载多个类
		userDao5.show();


	}
}
