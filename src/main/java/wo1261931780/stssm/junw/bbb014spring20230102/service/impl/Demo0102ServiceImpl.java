package wo1261931780.stssm.junw.bbb014spring20230102.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb014spring20230102.dao.Demo0102Dao;
import wo1261931780.stssm.junw.bbb014spring20230102.service.Demo0102Service;


/**
 * @author junw
 */
@Service
public class Demo0102ServiceImpl implements Demo0102Service {
	@Autowired
	private Demo0102Dao demo0102Dao;

	@Override
	public Boolean show0102service(String url, String paw) {
		String demo = "123";
		if (demo.equals(url)) {
			// demorun.debug("我是paw");
			// paw = paw.trim();
			// demorun.debug("我是paw:" + paw + "====");
			demo0102Dao.show0102dao(url, paw);
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
