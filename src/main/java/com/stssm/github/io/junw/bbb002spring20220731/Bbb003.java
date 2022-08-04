package com.stssm.github.io.junw.bbb002spring20220731;

import com.stssm.github.io.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.stssm.github.io
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-16-22  星期日
 * @description
 * @return
 * @exception
 */
public class Bbb003 {
	public static void main(String[] args) {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb001SpringContext.xml");
		// ApplicationContext其实也是一个实现类，
		// 而且这个实现类底下并没有close的方法
		// 将其修改为ClassPathXmlApplicationContext就有了
		// *****************************
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bbb001SpringContext.xml");
		System.out.println("我是运行类中，手动的新建dao对象");
		BookDao daoBeanXmlId = (BookDao) ctx.getBean("daoBeanXmlName");
		daoBeanXmlId.daoShow();
		// ctx.close();// 直接暴力关机
		// 类似于system.exit
		// 一旦执行了代码，后续的功能都不能执行
		System.out.println("开始关闭ioc");
		ctx.registerShutdownHook();// 关闭钩子，关闭前自动执行
	}
	// *****************************
	// 下面是所有的日志：
	// 17:54:04.939 [main] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@506e6d5e
	// 17:54:05.074 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 5 bean definitions from class path resource [bbb001SpringContext.xml]
	// 17:54:05.101 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'serviceBeanXmlId'
	// 我是dao构造方法，地址为：com.stssm.github.io.dao.impl.BookDaoImpl@291ae
	// 我是dao初始化过程
	// ***************************** 首先新建了一个对象，这个是默认新建的，所以会执行一次内部的初始化过程


	// 17:54:05.142 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'staticFactoryDaoBean'
	// 静态工厂新建一个dao对象
	// 我是dao构造方法，地址为：com.stssm.github.io.dao.impl.BookDaoImpl@40a4337a
	// ***************************** 这里是静态工厂新建对象的过程
	// ***************************** 没有执行对象的初始化。直接新建


	// 17:54:05.144 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'factoryDaoBean'
	// 17:54:05.144 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'factoryDaoBeanName'
	// 我是实例工厂
	// 我是dao构造方法，地址为：com.stssm.github.io.dao.impl.BookDaoImpl@6025e1b6
	// ***************************** 实例工厂新建对象，和静态工厂一样，新建完成没有执行初始化


	// 我是运行类中，手动的新建dao对象
	// 我是dao构造方法，地址为：com.stssm.github.io.dao.impl.BookDaoImpl@40005471
	// 我是dao初始化过程
	// 我是dao层
	// ***************************** 上面手动新建以后，进行了初始化，
	// ***************************** 同时手动执行了一次show方法的展示


	// 开始关闭ioc
	// ***************************** 如果直接close，这里是没有对应的过程展示
	// 17:54:05.158 [SpringContextShutdownHook] DEBUG org.springframework.context.support.ClassPathXmlApplicationContext - Closing org.springframework.context.support.ClassPathXmlApplicationContext@506e6d5e, started on Sun Jul 31 17:54:04 CST 2022
}
