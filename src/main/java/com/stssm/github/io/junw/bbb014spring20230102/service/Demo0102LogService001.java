package com.stssm.github.io.junw.bbb014spring20230102.service;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface Demo0102LogService001 {

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	void insertLog(String output, String input, Double money);
	// 这里实际上是在指定事物的分派
	// 表示，我要新建一个事物，该独立的时候独立，不自己玩了
}
