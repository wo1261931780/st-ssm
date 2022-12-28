package com.stssm.github.io.junw.bbb011spring20221226;

import com.stssm.github.io.junw.bbb011spring20221226.config.Spring1226Configuration001;
import com.stssm.github.io.junw.bbb011spring20221226.dao.impl.demo1226daoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226
 *
 * @author liujiajun_junw
 * @Date 2022-12-17-30  星期三
 * @description
 */
public class Bbb034 {
	public static void main(String[] args) {
		ApplicationContext x=new AnnotationConfigApplicationContext(Spring1226Configuration001.class);
		demo1226daoImpl demo1226dao = x.getBean(demo1226daoImpl.class);
		demo1226dao.show();


	}
}
