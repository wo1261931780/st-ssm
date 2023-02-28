package com.stssm.github.io.junw;

import com.stssm.github.io.junw.bbb021spring20230111.dao.Demo0111Dao001;
import com.stssm.github.io.junw.bbb021spring20230111.domain.Demo0111Domain001;
import com.stssm.github.io.junw.bbb021spring20230111.service.Demo0111Service001;
import com.stssm.github.io.stssm.github.io.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
class ApplicationTests {
	// 这个测试类添加了SpringBootTest注解
	// 如果要添加一个

	@Autowired
	private Demo0111Service001 demo0111Service001;

	@Autowired
	private Demo0111Dao001 demo0111Dao001;

	@Test
	void contextLoads() {
		demo0111Service001.serviceShow();
	}


	@Test
	Demo0111Domain001 getById() {
		return demo0111Dao001.getById(1);
	}

}