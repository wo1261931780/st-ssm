package com.stssm.github.io.junw.bbb014spring20230102.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
/**
 * @author junw
 */
@Repository
public interface LogDao {
	/**
	 * 新增日志
	 * @param info 等级
	 */
	@Insert("insert into tbl_log (info,createDate) values(#{info,jdbcType=VARCHAR},now())")
	void insertLog(String info);
}