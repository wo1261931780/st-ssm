package com.stssm.github.io.junw.bbb002_2022年7月31日;

import com.stssm.github.io.dao.userDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002_2022年7月31日
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-16  星期日
 * @description
 * @return
 * @exception
 */
public class bbb004 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("SpringContext.xml");
		userDao userDaoBeanXmlId = (userDao) ctx.getBean("userDaoBeanXmlId");
		userDaoBeanXmlId.showMeSetter();

		ctx.registerShutdownHook();

	}
}
