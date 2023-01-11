package com.stssm.github.io.junw.bbb014spring20230102.service.impl;

import com.stssm.github.io.junw.bbb014spring20230102.dao.Demo0102Dao;
import com.stssm.github.io.junw.bbb014spring20230102.service.Demo0102Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

@Service
public class Demo0102ServiceImpl implements Demo0102Service {
	@Autowired
	private Demo0102Dao demo0102Dao;

	@Override
	public Boolean show0102service(String url, String paw) {
		if (url.equals("123")) {
			// demorun.debug("我是paw");
			// paw = paw.trim();
			// demorun.debug("我是paw:" + paw + "====");
			demo0102Dao.show0102dao(url, paw);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}