package com.stssm.github.io.junw.bbb021spring20230111.dao;

import com.stssm.github.io.junw.bbb021spring20230111.domain.Demo0111Domain001;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Demo0111Dao001 {
	// 这里的Mapper，也就是需要给spring去完成管理
	// 而mapper的意思，就是数据库查询


	@Select("select * from tbl_book where id=#{id}")
	public Demo0111Domain001 getById(Integer id);
}
