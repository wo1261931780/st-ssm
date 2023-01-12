package com.stssm.github.io.junw.bbb014spring20230102.dao.impl;

import com.stssm.github.io.junw.bbb014spring20230102.dao.Demo0102Dao;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * @author junw
 */
@Repository
public class Demo0102DaoImpl implements Demo0102Dao {
	@Override
	public void show0102dao(String url, String paw) {
		demorun.debug("我是dao，这里是url：" + url + "，我是paw:" + paw + "====");
		demorun.debug(FINAL_SPLIT);
	}
}
