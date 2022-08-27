package com.stssm.github.io.junw.bbb005spring20220804.dao.Impl;

import com.stssm.github.io.junw.bbb005spring20220804.dao.Demo0804Dao002;
import org.springframework.stereotype.Repository;


// @Component("demo0804Dao002Impl")
// 同样的，为了区分数据层，这里设置了一个repository的名称

@Repository("demo0804Dao002Impl")
public class Demo0804Dao002Impl implements Demo0804Dao002 {
	// 添加@Component注解，就代表了这是一个bean，
	// 相当于之前配置的<bean/>
	// 括号内的名称，相当于value="123"

	/**
	 *
	 */
	@Override
	public void demoDaoShow002() {
		System.out.println("我是xmlDemo0804Dao002中的demoDaoShow方法");
	}
}
