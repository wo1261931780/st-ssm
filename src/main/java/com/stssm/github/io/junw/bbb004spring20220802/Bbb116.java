package com.stssm.github.io.junw.bbb004spring20220802;

import com.stssm.github.io.dao.UserDao5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-30  星期二
 * @description
 */
public class Bbb116 {
	public static void main(String[] args) {
		// 加载容器的形式有很多
		// 这是第一种：加载类路径下的配置文件
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb103SpringContext.xml");

		// 如果从文件系统加载容器，就需要指定绝对路径
		// 第二种，从文件系统下加载配置文件
		// ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\1\\Documents\\GitHub\\st-ssm.github.io\\src\\main\\resources\\bbb103SpringContext.xml");

		// UserDao5 UserDao5 = (UserDao5) ctx.getBean("UserDao5");// 第一种
		// 第一种有问题，每次都需要强制转换格式
		// --------------------------------------------------------------------------------------------------
		// UserDao5 UserDao5 = ctx.getBean("UserDao5", UserDao5.class);// 第二种
		// 指定具体的类型，那么就可以避免类型发生异常
		// 这种带上文件字节码的形式，就不需要进行强转操作
		// --------------------------------------------------------------------------------------------------
		UserDao5 userDao5 = ctx.getBean(UserDao5.class);// 第三种，直接指定
		// 但是这种指定的方式，无法加载多个类，
		// 指定名称的类，只能存在一个
		userDao5.show();

		// 这里有个延迟加载bean，
		// BeanFactory是延迟加载bean
		// 如果是applicationContext，就是立刻加载bean
		// 延迟加载，主要是构造器在初始化的过程中，是否会立刻加载对象
		// 如果是延迟加载，那么构造器完成构造，无参构造中间出现的方法不会立即执行
	}
}
