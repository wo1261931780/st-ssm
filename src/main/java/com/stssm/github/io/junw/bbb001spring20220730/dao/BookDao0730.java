package com.stssm.github.io.junw.bbb001spring20220730.dao;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-15-11  星期六
 * @description
 * @return
 * @exception
 */
public interface BookDao0730 {
	/**
	 * 数据层接口
	 * 对应我们之前使用的model
	 */
	public void daoShow();

	/**
	 * 上面的show方法是正常使用的
	 * 但是对一个bean对象来说，
	 * 在创建以后，是存在一个完整生命周期的
	 * 我们可以根据生命周期来进行一些定义，从而展示对应的过程
	 */
	public void daoInit();

	/**
	 * 销毁阶段
	 */
	public void daoDestory();


}
