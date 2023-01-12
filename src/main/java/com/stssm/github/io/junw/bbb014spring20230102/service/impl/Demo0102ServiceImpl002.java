package com.stssm.github.io.junw.bbb014spring20230102.service.impl;

import com.stssm.github.io.junw.bbb014spring20230102.dao.Demo0102Dao002;
import com.stssm.github.io.junw.bbb014spring20230102.service.Demo0102LogService001;
import com.stssm.github.io.junw.bbb014spring20230102.service.Demo0102Service002;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;
/**
 * @author junw
 */
@Service
public class Demo0102ServiceImpl002 implements Demo0102Service002 {
	@Autowired
	Demo0102Dao002 demo0102Dao002;

	@Autowired
	private Demo0102LogService001 logService;


	@Override
	public void show0102service(String inputPerson, String outputPerson, Double balance) {
		demorun.debug("我是转账人：" + inputPerson + "，我是转出人：" + outputPerson + "，当前余额：" + balance);
		logService.insertLog(inputPerson, outputPerson, balance);
		// 先出现日志，不管成功还是失败
		// 这里其实也可以根据成功失败来判断是否进一步打印不同的日志
		demo0102Dao002.outputMoney(outputPerson, balance);
		// 如果在两个数据库操作之间，出现了异常，那么就需要及时回滚事物
		demo0102Dao002.inputMoney(inputPerson, balance);

	}
}
