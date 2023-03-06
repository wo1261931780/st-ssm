package wo1261931780.stssm.junw.bbb016spring20230104.dao.impl;

import com.stssm.github.io.junw.bbb016spring20230104.dao.Demo0104Dao001;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * @author junw
 */
@Repository
public class Demo0104Dao001Impl implements Demo0104Dao001 {
	@Override
	public void show() {
		demorun.debug("我是Demo0104Dao001Impl中的show方法");
	}
}
