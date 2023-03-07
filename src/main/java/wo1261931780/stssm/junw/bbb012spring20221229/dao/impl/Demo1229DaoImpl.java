package wo1261931780.stssm.junw.bbb012spring20221229.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb012spring20221229.dao.Demo1229Dao;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb012spring20221229.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-12-16-40  星期四
 * @description
 */
@Repository("Demo1229DaoImpl")
@Slf4j
public class Demo1229DaoImpl implements Demo1229Dao {
	@Override
	public void show() {
		log.debug("我是show方法");
	}
}
