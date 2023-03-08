package wo1261931780.junw.bbb023spring20230113;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wo1261931780.stssm.junw.bbb023spring20230113.dao.Demo0113UserDao002;

import java.util.List;


@SpringBootTest
class SpringBootDemo2ApplicationTests5 {

	@Autowired
	private Demo0113UserDao002 demo0113UserDao002;

	@Test
	void testDeleteBatchById(List<Long> demoList) {
		// 批量删除的前提是，有对应的数据list存在
		demo0113UserDao002.deleteBatchIds(demoList);
	}

	@Test
	void testSelectBatchById(List<Long> demoList) {
		// List<Long> demoList1 = new ArrayList<>();
		// demoList1.add(12311231L);
		// demoList1.add(12311231L);
		// demoList1.add(12311231L);
		demo0113UserDao002.selectBatchIds(demoList);
		// 批量删除和批量选择，都是一样的
	}
}
