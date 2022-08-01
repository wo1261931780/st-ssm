package com.stssm.github.io.dao.impl;

import com.stssm.github.io.dao.userDao4;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
public class userDaoImpl4 implements userDao4, InitializingBean, DisposableBean {

	private int[] array;
	private List<String> list;
	private Set<String> set;

	private Map<String, String> map;

	private Properties properties;

	public void setArray(int[] array) {
		this.array = array;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("我是结束阶段");
	}

	/**
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是初始化阶段");
	}

	/**
	 *
	 */
	@Override
	public void show() {
		System.out.println("我是集合：" + Arrays.toString(array));
		System.out.println("我是list：" + list.toString());
		System.out.println("我是set对象：" + set);
		System.out.println("我是map：" + map);
		System.out.println("我是property：" + properties);
	}
}
