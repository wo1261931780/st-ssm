package com.stssm.github.io.junw.bbb007spring20220806.service.Impl;

import com.stssm.github.io.junw.bbb007spring20220806.dao.Demo0806Dao002;
import com.stssm.github.io.junw.bbb007spring20220806.service.Demo0806Service002;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-08  星期一
 * @description
 */
@Service
public class Demo0806Service002Impl implements Demo0806Service002 {
	@Autowired
	private Demo0806Dao002 demo0806Dao002;
	// 我们之前已经配置了自动装配
	// 	但是这里出现了两个实现类
	// 	如果没写名称，直接按类型装配，就会出现不唯一的情况
	// *************************************************************
	// 需要注意的是：
	// 这里是按照对应名称完成的装配
	// 比如我这里写demo0806Dao002，名称也必须是002，否则会报错

	/**
	 *
	 */
	@Override
	public void demo0806Service002Show() {
		System.out.println("我是Demo0806Service002中的demo0806Service002Show002方法");
		demo0806Dao002.demo0806DaoShow002();
	}
}
