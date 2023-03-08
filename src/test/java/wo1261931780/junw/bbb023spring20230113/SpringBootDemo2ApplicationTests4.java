package wo1261931780.junw.bbb023spring20230113;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.stssm.junw.bbb023spring20230113.dao.Demo0113UserDao002;
import wo1261931780.stssm.junw.bbb023spring20230113.domain.Demo0113Domain001;


@SpringBootTest
class SpringBootDemo2ApplicationTests4 {

	@Autowired
	private Demo0113UserDao002 demo0113UserDao002;

	@Test
	void testInsertOneInput() {
		Demo0113Domain001 demo0113Domain001 = new Demo0113Domain001();
		demo0113Domain001.setId(11);// 因为数据库要求主键不为空
		// 所以这里一定自己输入一个内容进去
		demo0113UserDao002.insert(demo0113Domain001);
	}

	@Test
	void testInsertOneAssignId() {
		Demo0113Domain001 demo0113Domain001 = new Demo0113Domain001();
		// 这里还是id为空，但是我们使用了AssignId
		// 所以会随机生成一个值
		demo0113UserDao002.insert(demo0113Domain001);
	}
}
