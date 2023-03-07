package wo1261931780.stssm.junw.bbb011spring20221226.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb011spring20221226.dao.Demo1226Dao;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb011spring20221226.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-21  星期一
 * @description
 */
@Repository("Demo1226DaoImpl")
@Slf4j
public class Demo1226DaoImpl implements Demo1226Dao {
	@Override
	public void show() {
		// log.debug("我是show方法");
		long startTimeMillis = System.currentTimeMillis();
		int demo = 10;
		for (int i = 0; i < demo; i++) {
			log.debug("我是show方法");
		}
		long endTimeMillis = System.currentTimeMillis();
		long duringTime = endTimeMillis - startTimeMillis;
		log.debug("执行一万次消耗时间：" + duringTime + "ms");
	}

	@Override
	public void delete(int demo) {
		log.debug("我是delete方法");
	}

	@Override
	public void update() {
		log.debug("我是update方法");
	}

	@Override
	public void select() {
		log.debug("我是select方法");
	}

	@Override
	public void save() {
		log.debug("我是save方法");
	}
}
