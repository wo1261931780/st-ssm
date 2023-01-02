package com.stssm.github.io.junw.bbb014spring20230102.service.impl;

import com.stssm.github.io.junw.bbb014spring20230102.dao.Demo0102Dao002;
import com.stssm.github.io.junw.bbb014spring20230102.service.Demo0102Service002;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

@Service
public class Demo0102ServiceImpl002 implements Demo0102Service002 {
	@Autowired
	Demo0102Dao002 demo0102Dao002;

	@Override
	public void show0102service(String inputPerson, String outputPerson, Double balance) {
		demorun.debug("我是转账人：" + inputPerson + "，我是转出人：" + outputPerson + "，当前余额：" + balance);
		demo0102Dao002.outputMoney(outputPerson, balance);
		// 如果在两个数据库操作之间，出现了异常，那么就需要及时回滚事物
		demo0102Dao002.inputMoney(inputPerson, balance);
	}
}
