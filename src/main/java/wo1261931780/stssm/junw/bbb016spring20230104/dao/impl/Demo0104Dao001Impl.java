package wo1261931780.stssm.junw.bbb016spring20230104.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb016spring20230104.dao.Demo0104Dao001;


/**
 * @author junw
 */
@Repository
@Slf4j
public class Demo0104Dao001Impl implements Demo0104Dao001 {
	@Override
	public void show() {
		log.debug("我是Demo0104Dao001Impl中的show方法");
	}
}
