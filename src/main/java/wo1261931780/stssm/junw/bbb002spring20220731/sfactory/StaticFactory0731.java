package wo1261931780.stssm.junw.bbb002spring20220731.sfactory;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb002spring20220731.dao.UserDao002;
import wo1261931780.stssm.junw.bbb002spring20220731.dao.impl.UserDao002Impl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731.staticFactory
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-45  星期三
 * @description
 */
@Slf4j
public class StaticFactory0731 {
	public static UserDao002 factoryGetDao002() {
		log.debug("已经通过静态工厂staticFactory0731获得一个UserDao002Impl");
		return new UserDao002Impl();
	}
}
