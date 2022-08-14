package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730
 *
 * @author liujiajun_junw
 * @Date 2022-08-15-00  星期日
 * @description
 */
public class Bbb002 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bbb001.xml");
		DemoService1 demoService1 = (DemoService1) ctx.getBean("demoService1");
		demoService1.serviceShow();
		// 逻辑是这样的：
		// 1.首先我在xml中配置了一个容器
		// 容器中已经指定好了，需要管理的service实现类
		// 2.然后在这里，我直接通过ctx拿到bean对象就可以了
		// 因为bean对象，就是配置得到的实现类对象
		// 3.也因此，我可以直接调用实现类中已经实现好了的serviceShow方法
		// 4.在我的service实现类中，又已经创建了一个dao对象
		// 所以我的service方法中，利用创建出来的dao对象，调用了dao实现类中的show方法
		// 5.总结下来：一共创建了两个impl对象
		// 一个是service的，通过xml配置得到
		// 一个是dao的，通过手动创建得到
	}
}
