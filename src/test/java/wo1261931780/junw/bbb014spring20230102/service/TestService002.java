package wo1261931780.junw.bbb014spring20230102.service;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import wo1261931780.stssm.junw.bbb014spring20230102.config.Spring0102configuration;
import wo1261931780.stssm.junw.bbb014spring20230102.service.Demo0102Service002;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.FINAL_SPLIT;

@Slf4j
@ContextConfiguration(classes = Spring0102configuration.class)
public class TestService002 {
	@Autowired
	private Demo0102Service002 demo0102Service002;

	@Test
	public void testShow0102service() {
		log.debug(FINAL_SPLIT);
		demo0102Service002.show0102service("tom", "jerry", 100D);
	}
}
