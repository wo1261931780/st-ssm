package wo1261931780.stssm.junw.bbb009spring20220919.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb009spring20220919.dao.Demo0919Dao001;
import wo1261931780.stssm.junw.bbb009spring20220919.domain.Account0919;
import wo1261931780.stssm.junw.bbb009spring20220919.service.Demo0919Service001;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.service.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-14-31  星期日
 * @description
 */
@Service
@Slf4j
public class Demo0919Service001Impl implements Demo0919Service001 {

	@Autowired
	@Qualifier("demo0919Dao001")
	private Demo0919Dao001 demo0919Dao001;

	/**
	 * 测试方法
	 */
	@Override
	public void show() {
		log.debug("我是user service 4");
	}

	/**
	 *
	 */
	@Override
	public Account0919 selectById(int id) {
		demo0919Dao001.daoShow001();
		return null;
	}
}
