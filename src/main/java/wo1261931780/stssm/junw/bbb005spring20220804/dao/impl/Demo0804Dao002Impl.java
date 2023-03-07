package wo1261931780.stssm.junw.bbb005spring20220804.dao.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb005spring20220804.dao.Demo0804Dao002;


// @Component("demo0804Dao002Impl")
// 同样的，为了区分数据层，这里设置了一个repository的名称

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.junw.bbb004spring20220802.dao.Impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-21-18  星期四
 * @description
 */
@Repository("demo0804Dao002Impl")
@Slf4j
public class Demo0804Dao002Impl implements Demo0804Dao002 {
	// 添加@Component注解，就代表了这是一个bean，
	// 相当于之前配置的<bean/>
	// 括号内的名称，相当于value="123"
	// @Repository("demo")
	// 如果我在注解里面写了名称，那么就可以按照名称来访问
	// 具体是在运行类中有不同体现


	/**
	 *
	 */
	@Override
	public void demoDaoShow002() {
		log.debug("我是xmlDemo0804Dao002中的demoDaoShow方法");
	}
}
