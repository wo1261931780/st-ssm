package com.stssm.github.io.junw.bbb016spring20230104;

import com.stssm.github.io.junw.bbb016spring20230104.configuration.spring0104Configuration001;
import com.stssm.github.io.junw.bbb016spring20230104.dao.Demo0104Dao001;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

public class Bbb043 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(spring0104Configuration001.class);
		Demo0104Dao001 demo0104Dao001 = context.getBean(Demo0104Dao001.class);
		demorun.debug("我是获取到的demo0104Dao001对象：" + demo0104Dao001);
		demorun.debug(FINAL_SPLIT);
	}
}
