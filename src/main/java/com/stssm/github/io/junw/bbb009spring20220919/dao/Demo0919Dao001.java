package com.stssm.github.io.junw.bbb009spring20220919.dao;

import com.stssm.github.io.junw.bbb009spring20220919.domain.Account0919;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb009spring20220919.dao
 *
 * @author liujiajun_junw
 * @Date 2022-09-22-40  星期日
 * @description
 */
public interface Demo0919Dao001 {
	void daoShow001();


	@Insert("insert into study001sql.demo1(id, name, age, sex, address, math, english, hire_date) VALUES(#{})")
	void addDao0919();

	@Delete("delete from study001sql.demo1 where id=#{demoId}")
	Integer deleteById(Integer demoId);

	@Update("update study001sql.demo1 set name  =#{demoName}  where id =#{demoId} ;")
	Integer updateByCondition(Integer demoId, String demoName);


	/**
	 * 根据id查询结果
	 *
	 * @param demoId
	 */
	@Select("select * from study001sql.demo1 where id=#{demoId};")
	Account0919 daoSelectById(Integer demoId);


}
