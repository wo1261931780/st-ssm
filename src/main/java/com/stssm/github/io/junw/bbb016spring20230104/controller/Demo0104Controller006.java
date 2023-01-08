package com.stssm.github.io.junw.bbb016spring20230104.controller;

import com.stssm.github.io.junw.bbb016spring20230104.domain.Demo0104DomainUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Demo0105Controller001")
public class Demo0104Controller006 {
	@RequestMapping("/getJsonListParams")
	@ResponseBody
	public String getJsonListParams(@RequestBody List<String> habits) {
		System.out.println("我是实体类Demo0105Controller001中getJsonListParams获取的数据:" + habits);
		// 之前开启了@EnableWebMvc，所以前端传递过来的参数，实际上都是使用对象来包裹的
		// 这里既然是对象包含着数据，那么我们直接使用requestBody来获取内部数据即可
		return "list类型的json数据返回成功";
	}

	@RequestMapping("/getJsonPojoParams")
	@ResponseBody
	public String getJsonPojoParams(@RequestBody Demo0104DomainUser demo0104DomainUser) {
		System.out.println("我是实体类Demo0105Controller001中getJsonPojoParams获取的数据:" + demo0104DomainUser);
		return "pojo类型的json数据返回成功";
	}

	@RequestMapping("/getJsonListPojoParams")
	@ResponseBody
	public String getJsonListPojoParams(@RequestBody List<Demo0104DomainUser> demo0104DomainUserList) {
		System.out.println("我是实体类Demo0105Controller001中getJsonListPojoParams获取的数据:" + demo0104DomainUserList);
		// 如果要传递多个对象，实际上传递一个数组，然后里面包含着多个json就可以了
		return "包含pojo对象的List类型json数据返回成功";
	}
}
