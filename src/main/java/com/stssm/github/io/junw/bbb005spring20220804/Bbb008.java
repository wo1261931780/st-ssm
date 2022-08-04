package com.stssm.github.io.junw.bbb005spring20220804;

import com.stssm.github.io.dao.UserDao6;
import com.stssm.github.io.dao.UserDao7;
import com.stssm.github.io.service.UserService1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb005spring20220804
 *
 * @author liujiajun_junw
 * @Date 2022-08-22-35  星期四
 * @description
 */
public class Bbb008 {
	public static void main(String[] args) {
		// 我们之前所接触的构造器注入，一般是在整合第三方框架的时候使用
		// 平时用的不多
		// 目前spring从2.0开始提供注解
		// 从2.5开始，注解就已经比较完善了
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bbb004SpringContext.xml");
		UserDao6 bean = applicationContext.getBean(UserDao6.class);
		System.out.println(bean);
		// 我们刚刚是通过xml去配置对应的组件，由组件映射到实体类
		// 现在通过注解的形式去设置一个新的
		UserDao7 bean1 = applicationContext.getBean(UserDao7.class);
		System.out.println(bean1);
		// 我们也可以直接在service上面添加对应的注解
		// 但是获取对象的方法需要发生变化
		UserService1 bean2 = applicationContext.getBean(UserService1.class);
		// 这里寻找的全部都是接口，不是具体的实现类
		// 但是注解又是写在实现类上面的
		System.out.println("我是service1中的对象：" + bean2);

	}
}
