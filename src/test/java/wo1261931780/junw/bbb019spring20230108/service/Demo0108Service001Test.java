package wo1261931780.junw.bbb019spring20230108.service;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wo1261931780.stssm.junw.bbb019spring20230108.configuration.Spring0108Configuration001;
import wo1261931780.stssm.junw.bbb019spring20230108.domain.Demo0108DomainTblBook;
import wo1261931780.stssm.junw.bbb019spring20230108.service.Demo0108Service001;

import java.util.List;

import static wo1261931780.stssm.junw.bbb001spring20220730.Bbb002.demorun;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Spring0108Configuration001.class)
public class Demo0108Service001Test {
	@Autowired
	private Demo0108Service001 demo0108Service001;

	@Test
	public void testById() {
		Demo0108DomainTblBook demo0108DomainTblBook = demo0108Service001.queryById(1);
		demorun.debug(""+demo0108DomainTblBook);
	}

	@Test
	public void testGetAll() {
		List<Demo0108DomainTblBook> demo0108DomainTblBooks = demo0108Service001.selectAll(1);
		demorun.debug(""+demo0108DomainTblBooks);
	}

	@Test
	public void testDelete() {
		Boolean byId = demo0108Service001.deleteById(1);
		demorun.debug(""+byId);
	}
}
