package wo1261931780.stssm.junw.bbb003spring20220801.dao.impl;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb003spring20220801.dao.DemoDao006;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220801.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-08  星期四
 * @description
 */
@Slf4j
public class DemoDao006Impl implements DemoDao006 {
	private int[] dao006Array;
	private List<String> dao006List;
	private Map<String, String> dao006Map;
	private Set<String> dao006Set;
	private Properties dao006Properties;

	/**
	 *
	 */
	@Override
	public void dao006Show() {
		log.debug("我是Dao006中的show方法");
	}

	public void setDao006Array(int[] dao006Array) {
		this.dao006Array = dao006Array;
	}

	public void setDao006List(List<String> dao006List) {
		this.dao006List = dao006List;
	}

	public void setDao006Map(Map<String, String> dao006Map) {
		this.dao006Map = dao006Map;
	}

	public void setDao006Set(Set<String> dao006Set) {
		this.dao006Set = dao006Set;
	}

	public void setDao006Properties(Properties dao006Properties) {
		this.dao006Properties = dao006Properties;
	}

	@Override
	public String toString() {
		return "DemoDao006Impl{" +
				       "dao006Array=" + Arrays.toString(dao006Array) +
				       ", dao006List=" + dao006List +
				       ", dao006Map=" + dao006Map +
				       ", dao006Set=" + dao006Set +
				       ", dao006Properties=" + dao006Properties +
				       '}';
	}
}
