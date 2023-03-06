package wo1261931780.stssm.junw.bbb016spring20230104.service.impl;

import com.stssm.github.io.junw.bbb016spring20230104.service.UserService0104;
import org.springframework.stereotype.Service;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * @author junw
 */
@Service
public class UserService0104Impl implements UserService0104 {
	@Override
	public void save() {
		demorun.debug("我是user service中的save方法");
	}
}
