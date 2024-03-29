package wo1261931780.stssm.junw.bbb004spring20220802.dao.impl;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb004spring20220802.dao.Demo0802Dao002;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-18  星期四
 * @description
 */
@Slf4j
public class Demo0802DaoImpl002 implements Demo0802Dao002 {
	private String demo0802DaoImplName;

	public Demo0802DaoImpl002(String demo0802DaoImplName) {
		this.demo0802DaoImplName = demo0802DaoImplName;
		log.debug("我是带参构造方法");
	}

	public Demo0802DaoImpl002() {
		log.debug("我是无参构造方法");
	}

	public void setDemo0802DaoImplName(String demo0802DaoImplName) {
		this.demo0802DaoImplName = demo0802DaoImplName;
	}

	@Override
	public void daoShow002() {
		log.debug("我是Demo0802Dao中的show方法");
		String format = String.format("我是Demo0802Dao中的变量%s", demo0802DaoImplName);
		log.debug(format);
	}
}
