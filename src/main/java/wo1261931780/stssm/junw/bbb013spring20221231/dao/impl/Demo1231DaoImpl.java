package wo1261931780.stssm.junw.bbb013spring20221231.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb013spring20221231.dao.Demo1231Dao;


/**
 * @author junw
 */
@Repository("Demo1231DaoImpl")
@Slf4j
public class Demo1231DaoImpl implements Demo1231Dao {
	@Override
	public String findName(int id) {
		log.debug("id是：" + id);
		// 下面是强制测试出现异常的语句
		// if (true) {
		// 	throw new NullPointerException();
		// }
		return "id";
	}
}
