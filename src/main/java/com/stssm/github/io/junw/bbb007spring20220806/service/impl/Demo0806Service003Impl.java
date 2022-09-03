package com.stssm.github.io.junw.bbb007spring20220806.service.impl;

import com.stssm.github.io.junw.bbb007spring20220806.dao.Demo0806Dao004;
import com.stssm.github.io.junw.bbb007spring20220806.service.Demo0806Service003;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class Demo0806Service003Impl implements Demo0806Service003 {


	@Autowired
	@Qualifier("demo0806Dao004")
	private Demo0806Dao004 demo0806Dao004;

	/**
	 *
	 */
	@Override
	public void demo0806Service003Show() {
		System.out.println("我是Demo0806Service004中的demo0806Service004Show004方法");
		demo0806Dao004.demo0806DaoShow004();
	}
}
