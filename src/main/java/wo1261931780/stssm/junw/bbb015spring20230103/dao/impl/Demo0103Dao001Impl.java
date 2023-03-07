package wo1261931780.stssm.junw.bbb015spring20230103.dao.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb015spring20230103.dao.Demo0103Dao001;
import wo1261931780.stssm.junw.bbb015spring20230103.domain.Demo0103Domain001;


/**
 * @author junw
 */
@Repository
@Slf4j
public class Demo0103Dao001Impl implements Demo0103Dao001 {
	@Override
	public void show(Demo0103Domain001 demo0103Domain001) {
		log.debug("我是Demo0104Dao001Impl中的show方法");
	}
}
