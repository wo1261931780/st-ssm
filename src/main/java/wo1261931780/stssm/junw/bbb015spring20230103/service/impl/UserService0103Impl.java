package wo1261931780.stssm.junw.bbb015spring20230103.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb015spring20230103.service.UserService0103;


/**
 * @author junw
 */
@Service
@Slf4j
public class UserService0103Impl implements UserService0103 {
	@Override
	public void save() {
		log.debug("我是user service中的save方法");
	}
}
