package com.stssm.github.io.junw.bbb019spring20230108.service.impl;

import com.stssm.github.io.junw.bbb019spring20230108.dao.Demo0108DaoTblBook;
import com.stssm.github.io.junw.bbb019spring20230108.domain.Demo0108DomainTblBook;
import com.stssm.github.io.junw.bbb019spring20230108.service.Demo0108Service001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Demo0108Service001Impl implements Demo0108Service001 {
	@Autowired
	private Demo0108DaoTblBook demo0108DaoTblBook;

	public Demo0108DomainTblBook queryById(Integer id) {
		Demo0108DomainTblBook demo0108DomainTblBook = demo0108DaoTblBook.queryById(id);
		return demo0108DomainTblBook;
	}

	public List<Demo0108DomainTblBook> selectAll(Integer id) {
		List<Demo0108DomainTblBook> demo0108DomainTblBookList = demo0108DaoTblBook.selectAll(id);
		return demo0108DomainTblBookList;
	}

	public int update(Demo0108DomainTblBook demo0108DomainTblBook) {
		int update = demo0108DaoTblBook.update(demo0108DomainTblBook);
		return update;
	}

	public int deleteById(Integer id) {
		int id1 = demo0108DaoTblBook.deleteById(id);
		return id1;
	}

	public Boolean saveOne(Demo0108DomainTblBook demo0108DomainTblBook) {
		demo0108DaoTblBook.saveOne(demo0108DomainTblBook);
		return Boolean.TRUE;
	}
}
