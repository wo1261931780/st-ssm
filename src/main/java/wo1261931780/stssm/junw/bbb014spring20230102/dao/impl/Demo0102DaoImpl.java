package wo1261931780.stssm.junw.bbb014spring20230102.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb014spring20230102.dao.Demo0102Dao;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;


/**
 * @author junw
 */
@Repository
@Slf4j
public class Demo0102DaoImpl implements Demo0102Dao {
	@Override
	public void show0102dao(String url, String paw) {
		log.debug("我是dao，这里是url：" + url + "，我是paw:" + paw + "====");
		log.debug(FINAL_SPLIT);
	}
}
