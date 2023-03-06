package wo1261931780.stssm.junw.bbb015spring20230103.dao.impl;

import com.stssm.github.io.junw.bbb015spring20230103.dao.Demo0103Dao001;
import com.stssm.github.io.junw.bbb015spring20230103.domain.Demo0103Domain001;
import org.springframework.stereotype.Repository;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * @author junw
 */
@Repository
public class Demo0103Dao001Impl implements Demo0103Dao001 {
	@Override
	public void show(Demo0103Domain001 demo0103Domain001) {
		demorun.debug("我是Demo0104Dao001Impl中的show方法");
	}
}
