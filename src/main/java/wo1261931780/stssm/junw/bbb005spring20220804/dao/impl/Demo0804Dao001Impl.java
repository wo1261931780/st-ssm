package com.stssm.github.io.junw.bbb005spring20220804.dao.impl;

import com.stssm.github.io.junw.bbb005spring20220804.dao.Demo0804Dao001;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb005spring20220804.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-19-26  星期六
 * @description
 */
// @Component
// @Repository

public class Demo0804Dao001Impl implements Demo0804Dao001 {
	// 上面加了注解，表示是一个dao组件以后，别的地方也需要通知到位，否则找不到对应的位置
	// 在这里，xml中已经配置好了对应的位置，所以我们不需要添加组件的注解也是可以的

	/**
	 *
	 */
	@Override
	public void demoDaoShow() {
		demorun.debug("我是xmlDemo0804Dao001中的demoDaoShow方法");
	}
}
