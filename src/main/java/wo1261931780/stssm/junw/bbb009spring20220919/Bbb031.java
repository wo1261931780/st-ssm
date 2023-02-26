package com.stssm.github.io.junw.bbb009spring20220919;

import com.stssm.github.io.junw.bbb009spring20220919.config.Spring0919Configuration001;
import com.stssm.github.io.junw.bbb009spring20220919.dao.Demo0919Dao001;
import com.stssm.github.io.junw.bbb009spring20220919.domain.Account0919;
import com.stssm.github.io.junw.bbb009spring20220919.service.Demo0919Service001;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb009spring20220918
 *
 * @author liujiajun_junw
 * @Date 2022-09-21-48  星期日
 * @description
 */
public class Bbb031 {
	public static void main(String[] args) {
		// ApplicationContext x = new AnnotationConfigApplicationContext(Spring0919Configuration001.class);
		ApplicationContext x = new AnnotationConfigApplicationContext(Spring0919Configuration001.class);
		Demo0919Dao001 bean = x.getBean(Demo0919Dao001.class);
		bean.daoShow001();
		Demo0919Service001 bean1 = x.getBean(Demo0919Service001.class);
		Account0919 account0919Dao = bean1.selectById(2);
		demorun.debug(account0919Dao.toString());
	}
}
