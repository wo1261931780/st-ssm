package com.stssm.github.io.junw.bbb014spring20230102.service;

import org.springframework.transaction.annotation.Transactional;

public interface Demo0102Service002 {
	/**
	 * 完成一次转账，汇入汇出操作合并
	 *
	 * @param inputPerson  汇入人
	 * @param outputPerson 汇出人
	 * @param balance      账户金额
	 */
	@Transactional
	void show0102service(String inputPerson, String outputPerson, Double balance);
}
