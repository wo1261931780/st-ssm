package wo1261931780.stssm.junw.bbb019spring20230108.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001;
import wo1261931780.stssm.junw.bbb019spring20230108.dao.Demo0108DaoTblBook;
import wo1261931780.stssm.junw.bbb019spring20230108.domain.Demo0108DomainTblBook;
import wo1261931780.stssm.junw.bbb019spring20230108.exception.SystemException;
import wo1261931780.stssm.junw.bbb019spring20230108.service.Demo0108Service001;

import java.util.List;


@Service
public class Demo0108Service001Impl implements Demo0108Service001 {
	@Autowired
	private Demo0108DaoTblBook demo0108DaoTblBook;

	public Demo0108DomainTblBook queryById(Integer id) {
		// 讲一下思路：
		// 这里可以用aop去写，在aop中抛出异常，然后统一处理
		// 最关键的是，不需要修改原有代码就可以实现这样的功能

		if (id == 0) {
			throw new SystemException("服务器异常，请重试", Demo0108CodeController001.GET_EXCEPTION_CODE_ERR);
		}
		Demo0108DomainTblBook demo0108DomainTblBook = demo0108DaoTblBook.queryById(id);
		try {
			int demo = 1 / 0;
		} catch (ArithmeticException demoException) {
			throw new SystemException("服务器超时，请重试", demoException, Demo0108CodeController001.GET_EXCEPTION_CODE_ERR);
		}
		return demo0108DomainTblBook;
	}

	public List<Demo0108DomainTblBook> selectAll(Integer id) {
		List<Demo0108DomainTblBook> demo0108DomainTblBookList = demo0108DaoTblBook.selectAll(id);
		return demo0108DomainTblBookList;
	}

	public Boolean update(Demo0108DomainTblBook demo0108DomainTblBook) {
		int update = demo0108DaoTblBook.update(demo0108DomainTblBook);
		return update > 0;
	}

	public Boolean deleteById(Integer id) {
		int id1 = demo0108DaoTblBook.deleteById(id);
		return id1 > 0;
	}

	public Boolean saveOne(Demo0108DomainTblBook demo0108DomainTblBook) {
		demo0108DaoTblBook.saveOne(demo0108DomainTblBook);
		return Boolean.TRUE;
	}
}
