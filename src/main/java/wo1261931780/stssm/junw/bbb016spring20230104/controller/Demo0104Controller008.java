package com.stssm.github.io.junw.bbb016spring20230104.controller;

import com.stssm.github.io.junw.bbb016spring20230104.domain.Demo0104DomainUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static com.stssm.github.io.junw.bbb001spring20220730.Bbb002.demorun;

/**
 * @author junw
 */
@Controller
public class Demo0104Controller008 {
	@RequestMapping("/toJumpPage")
	public String toJumpPage() {
		demorun.debug("我是Demo0105Controller003中的toJumpPage方法");
		return "index.jsp";
	}

	@RequestMapping("/toText")
	@ResponseBody
	public String toText() {
		demorun.debug("我是Demo0105Controller003中的toText方法");
		// 调用了ResponseBody，来保证下面的字符串可以作为数据直接返回
		return "toText返回了纯文本数据";
	}

	@RequestMapping("/toJsonPojo")
	@ResponseBody
	public Demo0104DomainUser toJsonPojo() {
		demorun.debug("我是Demo0105Controller003中的toJsonPojo方法");
		Demo0104DomainUser demo0104DomainUser = new Demo0104DomainUser();
		demo0104DomainUser.setName("demoName001");
		demo0104DomainUser.setAge(11);
		demorun.debug("我是返回的对象：" + demo0104DomainUser);
		return demo0104DomainUser;
		// 这里实际返回的是一个对象类型的数据
		// 但是在postman中，返回的是一个json的数据格式
		// 这里的转换，其实就是pom中的json依赖完成的
	}

	@RequestMapping("/toJsonListPojo")
	@ResponseBody
	public List<Demo0104DomainUser> toJsonListPojo() {
		demorun.debug("我是Demo0105Controller003中的toJsonListPojo方法");
		Demo0104DomainUser demo0104DomainUser001 = new Demo0104DomainUser();
		demo0104DomainUser001.setName("demoName001");
		demo0104DomainUser001.setAge(11);
		Demo0104DomainUser demo0104DomainUser002 = new Demo0104DomainUser();
		demo0104DomainUser002.setName("demoName002");
		demo0104DomainUser002.setAge(22);
		List<Demo0104DomainUser> demo0104DomainUserList = new ArrayList<>();
		demo0104DomainUserList.add(demo0104DomainUser001);
		demo0104DomainUserList.add(demo0104DomainUser002);
		demorun.debug("我是返回的对象：" + demo0104DomainUserList);
		// 这里也会返回json列表数据
		return demo0104DomainUserList;
	}
}
