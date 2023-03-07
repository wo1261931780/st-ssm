package wo1261931780.stssm.junw.bbb002spring20220731.factory;


import lombok.extern.slf4j.Slf4j;
import wo1261931780.stssm.junw.bbb002spring20220731.dao.UserDao002;
import wo1261931780.stssm.junw.bbb002spring20220731.dao.impl.UserDao002Impl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb002spring20220731.factory
 *
 * @author liujiajun_junw
 * @Date 2022-08-18-47  星期三
 * @description
 */
@Slf4j
public class Factory0731 {
	public UserDao002 factoryGetDao001() {
		log.debug("已经通过实例工厂Factory0731获得一个UserDao002Impl");
		return new UserDao002Impl();
	}
}
