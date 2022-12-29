package com.stssm.github.io.junw.bbb012spring20221229.dao.impl;

import com.stssm.github.io.junw.bbb012spring20221229.dao.Demo1229Dao;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-40  星期四
 * @description
 */
@Repository("Demo1229DaoImpl")
public class Demo1229DaoImpl implements Demo1229Dao {
	@Override
	public void show() {
		demorun.debug("我是show方法");
	}
}
