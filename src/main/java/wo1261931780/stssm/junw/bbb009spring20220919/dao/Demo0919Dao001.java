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
	/**
	 * show001方法
	 */
	void daoShow001();

	/**
	 * 添加一个dao
	 */
	@Insert("insert into study001sql.DEMO_1(id,  age, sex, address, math, english, hire_date) VALUES(#{})")
	void addDao0919();

	/**
	 * 根据id删除
	 *
	 * @param demoId id
	 * @return 返回删除数量
	 */
	@Delete("delete from study001sql.DEMO_1 where id=#{demoId}")
	Integer deleteById(Integer demoId);

	/**
	 * 根据条件修改数据
	 *
	 * @param demoId   id
	 * @param demoName name
	 * @return 返回影行数
	 */
	@Update("update study001sql.DEMO_1 set E_NAME  =#{demoName}  where id =#{demoId} ;")
	Integer updateByCondition(Integer demoId, String demoName);


	/**
	 * 根据id查询结果
	 *
	 * @param demoId id
	 * @return 返回对象
	 */
	@Select("select * from study001sql.DEMO_1 where id=#{demoId};")
	Account0919 daoSelectById(Integer demoId);


}
