package com.stssm.github.io.junw.bbb007spring20220806.dao.impl;

import com.stssm.github.io.junw.bbb007spring20220806.dao.Demo0806Dao001;
import org.springframework.stereotype.Repository;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-06  星期一
 * @description
 */
@Repository
public class Demo0806Dao001Impl implements Demo0806Dao001 {
	// 我们找到dao就会发现
	// 这里并没有对dao设置具体的名称
	// 所以autowired就是按照类型完成装配的

	/**
	 *
	 */
	@Override
	public void demo0806DaoShow() {
		demorun.debug("我是Demo0806Dao001Impl中的demo0806DaoShow方法");

	}
}
