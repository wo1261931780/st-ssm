package com.stssm.github.io.junw.bbb019spring20230108.dao;

import com.stssm.github.io.junw.bbb019spring20230108.domain.Demo0108DomainTblBook;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * (TblBook)表数据库访问层
 *
 * @author makejava
 * @since 2023-01-08 11:37:05
 */
// @Repository
public interface Demo0108DaoTblBook {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param id 主键
	 * @return 实例对象
	 */
	@Select("select * from study001sql.tbl_book where id=#{id};")
	Demo0108DomainTblBook queryById(Integer id);

	/**
	 * 查询所有数据
	 *
	 * @return list
	 */
	@Select("select * from study001sql.tbl_book;")
	List<Demo0108DomainTblBook> selectAll(Integer id);


	/**
	 * 修改数据
	 *
	 * @param demo0108DomainTblBook 实例对象
	 * @return 影响行数
	 */
	@Update("update study001sql.tbl_book set type=#{type},name=#{name},description=#{description} where id=#{id}")
	int update(Demo0108DomainTblBook demo0108DomainTblBook);

	/**
	 * 通过主键删除数据
	 *
	 * @param id 主键
	 * @return 影响行数
	 */
	@Delete("delete from study001sql.tbl_book where id=#{id};")
	int deleteById(Integer id);

	// @Insert("insert into tbl_book (type,name,description)) values (null,#{type},#{name},#{description})")

	/**
	 * 新增数据
	 *
	 * @param demo0108DomainTblBook 实例对象
	 * @return 影响行数
	 */
	@Insert("insert into study001sql.tbl_book (type,name,description) values (#{type},#{name},#{description})")
	void saveOne(Demo0108DomainTblBook demo0108DomainTblBook);

}
