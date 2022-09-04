package com.stssm.github.io.junw.bbb005spring20220804.service.impl;

import com.stssm.github.io.junw.bbb005spring20220804.dao.Demo0804Dao002;
import com.stssm.github.io.junw.bbb005spring20220804.service.Demo0804Service001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


// @Component
// 上面这里的component和service作用完全相同
// 只是spring官方为了区分不同的层级，来设置的名称而已

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-18  星期四
 * @description
 */
@Service
public class Demo0804Service001Impl implements Demo0804Service001 {
	/**
	 * 用不同的注解直接说明问题
	 * 数据层就是repository
	 * 接口业务层就是controller
	 * 然后在表现层就是service
	 */
	@Autowired
	private Demo0804Dao002 demo0804Dao002;
	// 这里没有注入，就会报错空指针


	public void setDemo0804Dao002(Demo0804Dao002 demo0804Dao002) {
		this.demo0804Dao002 = demo0804Dao002;
		// 所有的set，实际上都是将对象作为一个变量来操作
		// 如果没有set方法完成注入，就会出现报错
		// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.stssm.github.io.junw.bbb005spring20220804.dao.Demo0804Dao002.demoDaoShow002()" because "this.demo0804Dao002" is null
	}

	/**
	 *
	 */
	@Override
	public void demo0804Service001Show() {
		System.out.println("我是demo0804");
		System.out.println("开始调用dao中的方法");
		// demo0804Dao002.demoDaoShow002();
		// 这里一直报错，不知道为什么
	}
}
