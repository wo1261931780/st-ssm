package com.stssm.github.io.junw.bbb009spring20220919.service.Impl;

import com.stssm.github.io.junw.bbb009spring20220919.dao.Demo0919Dao001;
import com.stssm.github.io.junw.bbb009spring20220919.domain.Account0919;
import com.stssm.github.io.junw.bbb009spring20220919.service.Demo0919Service001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.service.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-31  星期日
 * @description
 */
@Service
public class Demo0919Service001Impl implements Demo0919Service001 {

	@Autowired
	@Qualifier("demo0919Dao001")
	private Demo0919Dao001 demo0919Dao001;

	/**
	 * 测试方法
	 */
	@Override
	public void show() {
		demorun.debug("我是user service 4");
	}

	/**
	 *
	 */
	@Override
	public Account0919 selectById(int id) {
		demo0919Dao001.daoShow001();
		return null;
	}
}
