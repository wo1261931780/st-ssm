package wo1261931780.stssm.junw.bbb021spring20230111.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb021spring20230111.service.Demo0111Service001;


/**
 * @author junw
 */
@Service
@Slf4j
public class Demo0111Service001Impl implements Demo0111Service001 {
	@Override
	public void serviceShow() {
		log.debug("demo001中的show方法被调用");
	}
}
