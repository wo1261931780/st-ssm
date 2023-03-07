package wo1261931780.stssm.junw.bbb014spring20230102.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author junw
 */
public interface Demo0102Service003 {
	/**
	 * 完成一次转账，汇入汇出操作合并
	 *
	 * @param inputPerson  汇入人
	 * @param outputPerson 汇出人
	 * @param balance      账户金额
	 */
	@Transactional(readOnly = true, rollbackFor = {IOException.class})
	void show0102service003(String inputPerson, String outputPerson, Double balance);

	// 是否为只读事务
	// 是否用不超时
	// rollbackFor = {IOException.class}
	// 出现异常，就直接回滚事物
}
