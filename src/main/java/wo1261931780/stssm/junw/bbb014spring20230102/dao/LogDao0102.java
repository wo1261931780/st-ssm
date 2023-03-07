package wo1261931780.stssm.junw.bbb014spring20230102.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author junw
 */
@Repository
public interface LogDao0102 {
	/**
	 * 新增日志
	 *
	 * @param info 等级
	 */
	@Insert("insert into tbls_log (info,createDate) values(#{info,jdbcType=VARCHAR},now())")
	void insertLog(String info);
}
