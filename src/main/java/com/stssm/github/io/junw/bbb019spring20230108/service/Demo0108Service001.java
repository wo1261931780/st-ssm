package com.stssm.github.io.junw.bbb019spring20230108.service;

import com.stssm.github.io.junw.bbb019spring20230108.domain.Demo0108DomainTblBook;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface Demo0108Service001 {
	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	Demo0108DomainTblBook queryById(Integer id);

	/**
	 * 查询所有数据
	 *
	 * @return list
	 */
	List<Demo0108DomainTblBook> selectAll(Integer id);


	/**
	 * 修改数据
	 *
	 * @param demo0108DomainTblBook 实例对象
	 * @return 影响行数
	 */
	int update(Demo0108DomainTblBook demo0108DomainTblBook);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	int deleteById(Integer id);


	/**
	 * 新增数据
	 *
	 * @param demo0108DomainTblBook 实例对象
	 * @return 影响行数
	 */
	Boolean saveOne(Demo0108DomainTblBook demo0108DomainTblBook);


}
