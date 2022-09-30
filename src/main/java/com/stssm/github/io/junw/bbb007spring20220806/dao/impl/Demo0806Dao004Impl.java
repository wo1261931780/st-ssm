package com.stssm.github.io.junw.bbb007spring20220806.dao.impl;

import com.stssm.github.io.junw.bbb007spring20220806.dao.Demo0806Dao004;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-06  星期一
 * @description
 */
@Repository("demo0806Dao004")
public class Demo0806Dao004Impl implements Demo0806Dao004 {
	// 上面两种方式都可以设置变量的名称

	@Value("name002")
	private String dao004Name002;
	// 这种方式来设置，内部的变量值可以来自于properties

	/**
	 *
	 */
	@Override
	public void demo0806DaoShow004() {
		demorun.debug("我是Demo0806Dao004Impl中的demo0806DaoShow方法");
		String dao004Name001 = "name001";
		String format = String.format("我是内部的变量001:%s", dao004Name001);
		demorun.debug(format);
		String format1 = String.format("我是内部的变量002:%s", dao004Name002);
		demorun.debug(format1);
	}
}
