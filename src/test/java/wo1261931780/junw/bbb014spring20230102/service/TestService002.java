package wo1261931780.junw.bbb014spring20230102.service;


import com.stssm.github.io.junw.bbb014spring20230102.config.Spring0102configuration;
import com.stssm.github.io.junw.bbb014spring20230102.dao.Demo0102Dao002;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;
import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(classes = Spring0102configuration.class)
public class TestService002 {
	@Autowired
	private Demo0102Service002 demo0102Service002;

	@Test
	public void testShow0102service() {
		demorun.debug(FINAL_SPLIT);
		demo0102Service002.show0102service("tom", "jerry", 100D);
	}
}
