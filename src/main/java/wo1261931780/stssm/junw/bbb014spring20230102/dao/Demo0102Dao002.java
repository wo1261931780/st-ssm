package wo1261931780.stssm.junw.bbb014spring20230102.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author junw
 */
@Repository
public interface Demo0102Dao002 {
	/**
	 * 汇入金额
	 *
	 * @param inputName 汇入人姓名
	 * @param money     金额
	 */
	@Update("update tbl_account set money=money+#{money,jdbcType=DOUBLE} where name=#{inputName,jdbcType=VARCHAR}")
	void inputMoney(@Param("inputName") String inputName, @Param("money") Double money);

	/**
	 * 汇出金额
	 *
	 * @param outputName 汇出人姓名
	 * @param money      金额
	 */
	@Update("update tbl_account set money=money-#{money,jdbcType=DOUBLE} where name=#{outputName,jdbcType=VARCHAR}")
	void outputMoney(@Param("outputName") String outputName, @Param("money") Double money);
}
