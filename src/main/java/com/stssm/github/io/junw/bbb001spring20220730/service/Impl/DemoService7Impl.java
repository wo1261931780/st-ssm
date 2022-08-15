package com.stssm.github.io.junw.bbb001spring20220730.service.Impl;

import com.stssm.github.io.junw.bbb001spring20220730.dao.DemoDao7;
import com.stssm.github.io.junw.bbb001spring20220730.dao.Impl.DemoDao7Impl;
import com.stssm.github.io.junw.bbb001spring20220730.service.DemoService7;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb001spring20220730.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-17-03  星期日
 * @description
 */
public class DemoService7Impl implements DemoService7, InitializingBean, DisposableBean {
	// 这里使用实现的方式，完成生命周期的测试
	// 左上角出现的小图标，对应的就是后面的spring配置出来的xml

	private DemoDao7 serviceDemoDao7;

	public void setServiceDemoDao7(DemoDao7Impl innerDemoDao7) {
		System.out.println("我是service7中的DI注入");
		this.serviceDemoDao7 = innerDemoDao7;
	}

	/**
	 *
	 */
	@Override
	public void servieShow7() {
		System.out.println("我是service中的show7方法");
		System.out.println("我是service中的Dao7对象：" + serviceDemoDao7);
		System.out.println("开始调用Dao中的show方法：--------------------------------------");
		serviceDemoDao7.show7();
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("我是service7中的销毁方法");
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是service7中的初始化方法");

	}
}
