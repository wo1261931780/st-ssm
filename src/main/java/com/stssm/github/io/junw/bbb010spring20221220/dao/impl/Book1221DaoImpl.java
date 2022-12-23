package com.stssm.github.io.junw.bbb010spring20221220.dao.impl;

import com.stssm.github.io.junw.bbb010spring20221220.dao.Book1221Dao;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb010spring20221220.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-12-08-35  星期三
 * @description
 */
public class Book1221DaoImpl implements Book1221Dao {
	@Override
	public void show() {
		demorun.debug("我是dao对应的实现类");
	}
}
