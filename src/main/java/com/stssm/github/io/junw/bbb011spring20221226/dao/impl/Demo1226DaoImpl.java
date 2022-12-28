package com.stssm.github.io.junw.bbb011spring20221226.dao.impl;

import com.stssm.github.io.junw.bbb011spring20221226.dao.Demo1226Dao;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-21  星期一
 * @description
 */
@Repository("Demo1226DaoImpl")
public class Demo1226DaoImpl implements Demo1226Dao {
	@Override
	public void show() {
		// demorun.debug("我是show方法");
		long startTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			demorun.debug("我是show方法");
		}
		long endTimeMillis = System.currentTimeMillis();
		long duringTime = endTimeMillis - startTimeMillis;
		demorun.debug("执行一万次消耗时间：" + duringTime + "ms");
	}

	public void update() {
		demorun.debug("我是update方法");
	}

	public void select() {
		demorun.debug("我是select方法");
	}

	public void delete() {
		demorun.debug("我是delete方法");
	}

	public void save() {
		demorun.debug("我是save方法");
	}
}
