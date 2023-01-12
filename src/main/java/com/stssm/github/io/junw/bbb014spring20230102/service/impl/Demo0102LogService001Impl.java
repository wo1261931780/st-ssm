package com.stssm.github.io.junw.bbb014spring20230102.service.impl;

import com.stssm.github.io.junw.bbb014spring20230102.dao.LogDao;
import com.stssm.github.io.junw.bbb014spring20230102.service.Demo0102LogService001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author junw
 */
@Service
public class Demo0102LogService001Impl implements Demo0102LogService001 {
	@Autowired
	private LogDao logDao;

	@Override
	public void insertLog(String output, String input, Double money) {
		logDao.insertLog("转账操作由" + output + "发起，到" + input + "，转账金额" + money);
	}
}
