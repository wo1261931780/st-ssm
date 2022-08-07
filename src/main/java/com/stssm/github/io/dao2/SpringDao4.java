package com.stssm.github.io.dao2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao2
 *
 * @author liujiajun_junw
 * @Date 2022-08-12-30  星期日
 * @description
 */
@Repository("springDao4")
@Scope("prototype")
public interface SpringDao4 {

	// @Select("select * from study002jdbc.account where id=#{id};")
	// public Account selectById(int id);

}
