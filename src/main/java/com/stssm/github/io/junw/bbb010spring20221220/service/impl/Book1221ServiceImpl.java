package com.stssm.github.io.junw.bbb010spring20221220.service.impl;

import com.stssm.github.io.junw.bbb010spring20221220.dao.Book1221Dao;
import com.stssm.github.io.junw.bbb010spring20221220.service.Book1221Service;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb010spring20221220.service.impl
 *
 * @author liujiajun_junw
 * @Date 2022-12-00-21  星期六
 * @description
 */
public class Book1221ServiceImpl implements Book1221Service {
	private Book1221Dao book1221Dao;

	@Override
	public void serviceShow() {
		demorun.debug("我是service中的show方法");
		book1221Dao.show();// ioc的思想，控制反转
		// 不通过new的方式新建一个对象，最终的目的都是解耦
		// 实际上，我们这里没有通过this的方式访问上面的对象
		// ===================================================================
		// ioc容器，实际上就是spring充当了这个步骤
		// ioc管理了一大堆的bean


	}
}
