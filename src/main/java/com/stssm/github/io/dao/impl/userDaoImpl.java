package com.stssm.github.io.dao.impl;

import com.stssm.github.io.dao.UserDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao.impl
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-05  星期日
 * @description
 * @return
 * @exception
 */
public class userDaoImpl implements UserDao, InitializingBean, DisposableBean {

	private int nums;
	private String resultStr;

	public void setNums(int nums) {
		this.nums = nums;
	}

	public void setResultStr(String resultStr) {
		this.resultStr = resultStr;
	}

	public void showMeSetter() {
		System.out.println("我是传递过来的结果：" + nums + "," + resultStr);

	}


	/**
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("我是销毁方法");
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是初始化方法");

	}
}
