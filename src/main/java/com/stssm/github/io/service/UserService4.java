package com.stssm.github.io.service;

import com.stssm.github.io.domain.Account;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.service
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-30  星期日
 * @description
 */
public interface UserService4 {
	/**
	 * 我是测试
	 */
	void show();

	/**
	 * 登录功能
	 *
	 * @param id
	 * @return id
	 */

	Account selectById(int id);
}
