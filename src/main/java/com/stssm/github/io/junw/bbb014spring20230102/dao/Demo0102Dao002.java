package com.stssm.github.io.junw.bbb014spring20230102.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author junw
 */
@Repository
public interface Demo0102Dao002 {
	@Update("update tbl_account set money=money+#{money,jdbcType=DOUBLE} where name=#{inputName,jdbcType=VARCHAR}")
	void inputMoney(@Param("inputName") String inputName,@Param("money") Double money);


	@Update("update tbl_account set money=money-#{money,jdbcType=DOUBLE} where name=#{outputName,jdbcType=VARCHAR}")
	void outputMoney(@Param("outputName") String outputName,@Param("money") Double money);
}
