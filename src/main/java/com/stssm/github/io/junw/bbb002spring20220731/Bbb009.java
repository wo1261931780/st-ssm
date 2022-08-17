package com.stssm.github.io.junw.bbb002spring20220731;

import com.stssm.github.io.junw.bbb002spring20220731.dao.UserDao002;
import com.stssm.github.io.junw.bbb002spring20220731.factory.Factory0731;
import com.stssm.github.io.junw.bbb002spring20220731.service.UserService002;
import com.stssm.github.io.junw.bbb002spring20220731.staticFactory.StaticFactory0731;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-41  星期三
 * @description
 */
public class Bbb009 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb009.xml");
		// 已经通过实例工厂Factory0731获得一个UserDao002Impl
		// 我是UserDao002初始化方法
		// 22:44:15.404 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'staticFactory0731'
		// 已经通过静态工厂staticFactory0731获得一个UserDao002Impl
		// 我是UserDao002初始化方法
		// =============================================
		// 这里可以根据控制台信息来分析结果：
		// 在加载完成配置文件以后，就会自动获取对应的实例工厂和静态工厂
		// 因为内部只有一个构造器方法，所以会自动完成单例的构造
		System.out.println("获得一个实例工厂对象：");
		Factory0731 factory0731 = (Factory0731) ctx.getBean("xmlFactory0731");
		System.out.println("实例工厂获得Dao001对象");
		UserDao002 factoryGetDao001 = factory0731.factoryGetDao001();
		factoryGetDao001.userDaoShow002();
		System.out.println("=============================================");
		System.out.println("获得一个静态工厂：");
		UserDao002 staticFactoryGetDao002 = StaticFactory0731.factoryGetDao002();
		System.out.println("静态工厂获得Dao001对象：");
		staticFactoryGetDao002.userDaoShow002();
		System.out.println("=============================================");
		System.out.println("手动构造了一个xmlUserService002：");
		UserService002 xmlUserService002 = (UserService002) ctx.getBean("xmlUserService002");
		xmlUserService002.serviceShow();
		System.out.println("=============================================");
		System.out.println("手动构造了一个xmlUserDao002：");
		UserDao002 xmlUserDao002 = (UserDao002) ctx.getBean("xmlUserDao002");
		xmlUserDao002.userDaoShow002();
		// 获得一个实例工厂对象：
		// 实例工厂获得Dao001对象
		// 已经通过实例工厂Factory0731获得一个UserDao002Impl
		// 我是UserDao002中的构造方法
		// =============================================
		// 获得一个静态工厂：
		// 已经通过静态工厂staticFactory0731获得一个UserDao002Impl
		// 静态工厂获得Dao001对象：
		// 我是UserDao002中的构造方法
		// ***************************** 实例工厂新建对象，和静态工厂一样，新建完成没有执行初始化

	}
}
