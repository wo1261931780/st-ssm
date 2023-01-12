package com.stssm.github.io.junw.bbb021spring20230111.controller;

import com.stssm.github.io.junw.bbb021spring20230111.domain.YmlSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junw
 */
@RestController
@RequestMapping("/Demo0111Controller001")
public class Demo0111Controller001 {
	// @Value("${name.data.name1}")
	// private String ymlData;
	// @Value("${name.data.subject[0]}")
	// private String ymlData2;
	// 读取subject数组的第0个元素
	// 放开上面的变量以后，项目就会启动失败
	// 还不清楚具体原因

	@Autowired
	private Environment ymlEnvironment;
	@Autowired
	private YmlSample ymlSample;

	@GetMapping("/{id}")
	public String getUserId(@PathVariable Integer id) {
		System.out.println("我是Demo0111Controller001类中的getUserId方法");
		System.out.println("我是接收到的id数值：" + id);
		return "getUserId返回成功";
	}
	// 其实这里，我们的spring boot项目已经开发完毕
	// 因为在spring boot中，已经包含了tomcat服务器
	// 所以我们不需要手动设置服务器的端口等参数


	@PostMapping("/{ymlData1}")
	public String getYmlData(@PathVariable String ymlData1) {
		System.out.println("我是形参数据：" + ymlData1);
		// System.out.println("我是配置文件中的数据：" + ymlData);
		// System.out.println("我是配置文件中的数据：" + ymlData2);
		System.out.println("我是配置文件中的数据0：" + ymlEnvironment);
		System.out.println("我是配置文件中的数据1：" + ymlEnvironment.getProperty("name.data"));
		// 我是配置文件中的数据1：null
		System.out.println("我是配置文件中的数据2：" + ymlEnvironment.getProperty("name.data.subject[1]"));
		// 我是配置文件中的数据2：chinese
		System.out.println("我是配置对应对象，拿到的结果：" + ymlSample);
		// 我是配置对应对象，拿到的结果：YmlSample{name1='123', name2='222', subject=[math, chinese, chemistry]}
		return "getYmlData返回成功";
	}
}
