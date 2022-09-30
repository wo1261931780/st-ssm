package com.stssm.github.io.junw.bbb009spring20220919.dao.Impl;

import com.stssm.github.io.junw.bbb009spring20220919.dao.Demo0919Dao001;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb009spring20220919.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-09-20-21  星期一
 * @description
 */
public class Demo0919Dao001Impl implements Demo0919Dao001 {
	/**
	 *
	 */
	@Override
	public void daoShow001() {
		demorun.debug("我是daoShow001中的show方法");
	}
}
