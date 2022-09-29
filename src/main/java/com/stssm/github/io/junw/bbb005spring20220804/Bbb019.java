package com.stssm.github.io.junw.bbb005spring20220804;

import com.stssm.github.io.junw.bbb005spring20220804.dao.Demo0804Dao001;
import com.stssm.github.io.junw.bbb005spring20220804.dao.Demo0804Dao002;
import com.stssm.github.io.junw.bbb005spring20220804.service.Demo0804Service001;
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
public class Bbb019 {
	public static void main(String[] args) {
		// 我们之前所接触的构造器注入，一般是在整合第三方框架的时候使用
		// 平时用的不多
		// 目前spring从2.0开始提供注解
		// 从2.5开始，注解就已经比较完善了
		// 3.0以后，就是纯注解开发了
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bbb023.xml");
		Demo0804Dao001 dao001 = (Demo0804Dao001) applicationContext.getBean("xmlDemo0804Dao001Impl");
		dao001.demoDaoShow();
		demorun.debug("我是dao001" + dao001);
		// ***********************************************************
		Demo0804Dao002 dao002 = (Demo0804Dao002) applicationContext.getBean("demo0804Dao002Impl");
		dao002.demoDaoShow002();
		demorun.debug("我是dao002" + dao002);
		// ***********************************************************
		// 以上都是使用名称来直接访问的
		Demo0804Service001 service001 = applicationContext.getBean(Demo0804Service001.class);
		service001.demo0804Service001Show();
		// 我们刚刚是通过xml去配置对应的组件，由组件映射到实体类
		// 现在通过注解的形式去设置一个新的

		// 我们也可以直接在service上面添加对应的注解
		// 但是获取对象的方法需要发生变化
		// UserService1 bean2 = applicationContext.getBean(UserService1.class);
		// 这里寻找的全部都是接口，不是具体的实现类
		// 但是注解又是写在实现类上面的
		// demorun.debug("我是service1中的对象：" + bean2);
	}
}
