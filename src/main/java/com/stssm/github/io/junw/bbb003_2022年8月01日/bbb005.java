package com.stssm.github.io.junw.bbb003_2022年8月01日;

import com.stssm.github.io.dao.userDao4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003_2022年8月01日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-08-19-43  星期一
 * @description
 * @return
 * @exception
 */
public class bbb005 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb001SpringContext.xml");
		// userDao4 userDao4 = (userDao4) ctx.getBean("userDao4");
		// 这里出错，因为名称对不上
		// 这里需要装配的是xml中设置的对象名称
		// 相当于，去指定xml中具体的装配对象id
		// userDao4 userDao4 = (userDao4) ctx.getBean(userDao4.class);
		// 当时以为是这里出了问题，其实根本不需要执行对应的类
		userDao4 userDao4 = (userDao4) ctx.getBean("userDao4BeanXmlId");
		userDao4.show();


	}


}
