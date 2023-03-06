package wo1261931780.stssm.junw.bbb006spring20220805.dao;

import com.stssm.github.io.junw.bbb009spring20220919.domain.Account0919;

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
	/**
	 * 测试方法
	 *
	 * @return id
	 */
	@Select("select * from study002jdbc.account where id=#{id};")
	Account0919 selectById(int id);

	/**
	 * 我是测试
	 */
	void demo0805Dao004Show();

}
