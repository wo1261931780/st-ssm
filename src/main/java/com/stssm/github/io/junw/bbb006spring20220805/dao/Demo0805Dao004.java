package com.stssm.github.io.junw.bbb006spring20220805.dao;

import com.stssm.github.io.domain.Account;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao2
 *
 * @author liujiajun_junw
 * @Date 2022-08-12-30  星期日
 * @description
 */

public interface Demo0805Dao004 {

	@Select("select * from study002jdbc.account where id=#{id};")
	Account selectById(int id);

	// --注释掉检查 (2022-09-01 12:48):
	void demo0805Dao004Show();

}
