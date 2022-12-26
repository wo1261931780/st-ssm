package com.stssm.github.io.junw.bbb010spring20221220.dao;

import com.stssm.github.io.junw.bbb010spring20221220.domain.Account1221;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Delete.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb010spring20221220.dao.impl
 *
 * @author liujiajun_junw
 * @Date 2022-12-08-35  星期三
 * @description
 */
public interface Book1221Dao {
	void show();


	@Insert("insert into study001sql.demo_1(e_name, age, address) values (#{name},#{age},#{address})")
	void save(Account1221 demoAccount);

	@Delete("delete from study001sql.demo_1 where id=#{id}")
	void delete(Integer id);

	@Update("update study001sql.demo_1 set E_NAME=#{name},address=#{address},age=#{age}")
	void update(Account1221 demoAccount);

	@Select("select * from study001sql.demo_1 where id=#{id}")
	Account1221 queryById(Integer id);

	// @Select("select * from study001sql.demo_1 where E_NAME like #{name};")
	// List<Account1221> queryAll(String name);


}
