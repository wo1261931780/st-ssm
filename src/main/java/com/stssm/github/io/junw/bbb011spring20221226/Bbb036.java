package com.stssm.github.io.junw.bbb011spring20221226;

import com.stssm.github.io.junw.bbb011spring20221226.config.Spring1226Configuration001;
import com.stssm.github.io.junw.bbb011spring20221226.dao.Demo1226Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226
 *
 * @author liujiajun_junw
 * @Date 2022-12-20-16  星期三
 * @description
 */
public class Bbb036 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring1226Configuration001.class);
		Demo1226Dao demo1226Dao = applicationContext.getBean(Demo1226Dao.class);
		demo1226Dao.delete(1);
		demorun.debug("我是新的方法");
		// demorun.debug(FINAL_SPLIT);
		demo1226Dao.update();
	}
}
