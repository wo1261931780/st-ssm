package com.stssm.github.io.junw.bbb013spring20221231.dao.impl;

import com.stssm.github.io.junw.bbb013spring20221231.dao.Demo1231Dao;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;
/**
 * @author junw
 */
@Repository("Demo1231DaoImpl")
public class Demo1231DaoImpl implements Demo1231Dao {
	@Override
	public String findName(int id) {
		demorun.debug("id是：" + id);
		// 下面是强制测试出现异常的语句
		// if (true) {
		// 	throw new NullPointerException();
		// }
		return "id";
	}
}
