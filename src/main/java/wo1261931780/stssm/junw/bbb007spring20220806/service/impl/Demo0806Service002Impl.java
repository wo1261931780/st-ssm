package wo1261931780.stssm.junw.bbb007spring20220806.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import wo1261931780.stssm.junw.bbb007spring20220806.dao.Demo0806Dao002;
import wo1261931780.stssm.junw.bbb007spring20220806.service.Demo0806Service002;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb007spring20220806.service.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-23-08  星期一
 * @description
 */
@Service
@Slf4j
public class Demo0806Service002Impl implements Demo0806Service002 {
	// @Autowired
	// private Demo0806Dao002 demo0806Dao002;
	// 我们之前已经配置了自动装配
	// 	但是这里出现了两个实现类
	// 	如果没写名称，直接按类型装配，就会出现不唯一的情况
	// *************************************************************
	// 需要注意的是：
	// 这里是按照对应名称完成的装配
	// 比如我这里写demo0806Dao002，名称也必须是002，否则会报错
	// *************************************************************

	@Autowired
	@Qualifier("demo0806Dao003")
	private Demo0806Dao002 demo0806Dao002;
	// 如果类型底下的实现类不唯一
	// 那么可以这样指定名称，从而实现装配
	// *************************************************************
	// 这里拓展几个说明吧
	// 1.@Autowired是通过暴力反射的方式拿到对应的对象，所以不需要添加setter方法
	// 2.我们自动装配，使用的是无参构造，
	// 因为无参构造方法是默认提供的，所以这里不需要添加


	/**
	 *
	 */
	@Override
	public void demo0806Service002Show() {
		log.debug("我是Demo0806Service002中的demo0806Service002Show002方法");
		demo0806Dao002.demo0806DaoShow002();
	}
}
