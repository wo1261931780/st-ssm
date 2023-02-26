package com.stssm.github.io.junw.bbb003spring20220801.dao.impl;

import com.stssm.github.io.junw.bbb003spring20220801.dao.DemoDao001;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb003spring20220801.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-08  星期四
 * @description
 */
public class DemoDao001Impl implements DemoDao001 {
	/**
	 *
	 */
	@Override
	public void dao001Show() {
		demorun.debug("我是Dao001中的show方法");
	}
}
