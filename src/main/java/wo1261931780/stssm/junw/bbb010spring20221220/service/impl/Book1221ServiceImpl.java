package com.stssm.github.io.junw.bbb010spring20221220.service.impl;

import com.stssm.github.io.junw.bbb010spring20221220.dao.Book1221Dao;
import com.stssm.github.io.junw.bbb010spring20221220.domain.Account1221;
import com.stssm.github.io.junw.bbb010spring20221220.service.Book1221Service;
import org.springframework.beans.factory.annotation.Autowired;


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
	@Autowired
	private Book1221Dao book1221Dao;


	public void save(Account1221 demo) {
		book1221Dao.save(demo);
	}

	public void update(Account1221 demo) {
		book1221Dao.update(demo);
	}

	public void delete(Integer id) {
		book1221Dao.delete(id);
	}

	public Account1221 findById(Integer id) {
		return book1221Dao.queryById(id);
	}

	// public List<Account1221> findAll(String name) {
	// 	return book1221Dao.queryAll(name);
	// }


	@Override
	public void serviceShow() {
		demorun.debug("我是service中的show方法");
		book1221Dao.show();// ioc的思想，控制反转
		// 不通过new的方式新建一个对象，最终的目的都是解耦
		// 实际上，我们这里没有通过this的方式访问上面的对象
		// ===================================================================
		// ioc容器，实际上就是spring充当了这个步骤
		// ioc管理了一大堆的bean
		// 而且，ioc完成了对象的初始化和创建这两个过程
		// ===================================================================
		// 除此以外，ioc容器还有依赖注入的功能
		// 比如dao需要依赖service才能继续使用，但是我没有对其赋予依赖关系
		// 所以ioc容器就自动帮我完成了绑定
	}
}
