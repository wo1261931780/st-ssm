package com.stssm.github.io.junw.bbb011spring20221226.dao;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226.dao
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-21  星期一
 * @description
 */
public interface Demo1226Dao {
	/**
	 * show方法
	 */
	void show();

	/**
	 * 删除
	 *
	 * @param demo 对象id
	 */
	void delete(int demo);

	/**
	 * 更新
	 */
	void update();

	/**
	 * 选择一个对象
	 */
	void select();

	/**
	 * 保存一个对象
	 */
	void save();

}
