package com.stssm.github.io.junw.bbb011spring20221226;

import com.stssm.github.io.junw.bbb011spring20221226.config.Spring1226Configuration001;
import com.stssm.github.io.junw.bbb011spring20221226.dao.Demo1226Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226
 *
 * @author liujiajun_junw
 * @Date 2022-12-17-30  星期三
 * @description
 */
public class Bbb034 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring1226Configuration001.class);
		Demo1226Dao demo1226dao = applicationContext.getBean(Demo1226Dao.class);
		// 这里直接使用实现类，会导致报错，找不到对应的类
		// 如果使用父类，就可以避免这个问题，但是执行的，还是实现类中的方法体
		demo1226dao.show();
		// 这里实际上创建了一个代理对象，
		// 在spring容器中，保存的实际上也就是代理对象
	}
}
