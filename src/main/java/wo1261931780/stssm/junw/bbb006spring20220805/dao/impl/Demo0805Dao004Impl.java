package wo1261931780.stssm.junw.bbb006spring20220805.dao.impl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import wo1261931780.stssm.junw.bbb006spring20220805.dao.Demo0805Dao004;
import wo1261931780.stssm.junw.bbb009spring20220919.domain.Account0919;


/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.dao2.impl
 *
 * @author liujiajun_junw
 * @Date 2022-08-20-55  星期五
 * @description
 */
@Repository("Demo0805Dao004Impl")
@Scope("prototype")
@Slf4j
public class Demo0805Dao004Impl implements Demo0805Dao004 {

	@Value("123")
	private int age;
	@Value("${jdbc.url}")
	private String name;
	// 使用注解定义变量的值，好处在于，可以直接加载外部的文件，然后拿到文件中的属性值


	/**
	 */
	@Override
	public Account0919 selectById(int id) {
		return null;
	}

	/**
	 * 我是测试
	 */
	@Override
	public void demo0805Dao004Show() {
		log.debug("我是spring dao3中的show方法");
		String format = String.format("我是name：%s", name);
		log.debug(format);
	}

	@PostConstruct
	public void initLife() {
		// 注解的直译：在构造之前
		log.debug("SpringDao3中的初始化方法");
	}

	@PreDestroy
	public void destroyLife() {
		// 注解直译：在销毁之前
		log.debug("SpringDao3中的销毁方法");
	}
}
