package com.stssm.github.io.junw.bbb013spring20221231;

import com.stssm.github.io.junw.bbb013spring20221231.config.Spring1231Configuration;
import com.stssm.github.io.junw.bbb013spring20221231.dao.Demo1231Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;


/**
 * @author junw
 */
public class Bbb040 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring1231Configuration.class);
		Demo1231Dao demo1231Dao = context.getBean(Demo1231Dao.class);
		demorun.debug(demo1231Dao.findName(11));
	}
}
