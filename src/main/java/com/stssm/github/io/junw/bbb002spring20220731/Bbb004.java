package com.stssm.github.io.junw.bbb002spring20220731;

import com.stssm.github.io.dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-20-16  星期日
 * @description
 * @return
 * @exception
 */
public class Bbb004 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bbb101SpringContext.xml");
		UserDao userDaoBeanXmlId = (UserDao) ctx.getBean("userDaoBeanXmlId");
		userDaoBeanXmlId.showMeSetter();

		ctx.registerShutdownHook();

	}
}
