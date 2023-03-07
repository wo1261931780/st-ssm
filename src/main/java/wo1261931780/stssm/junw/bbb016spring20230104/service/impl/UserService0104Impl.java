package wo1261931780.stssm.junw.bbb016spring20230104.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb016spring20230104.service.UserService0104;


/**
 * @author junw
 */
@Service
@Slf4j
public class UserService0104Impl implements UserService0104 {
	@Override
	public void save() {
		log.debug("我是user service中的save方法");
	}
}
