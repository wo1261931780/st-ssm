package com.stssm.github.io.junw.bbb018spring20230106.controller;

import com.stssm.github.io.junw.bbb018spring20230106.domain.Demo0106DomainUser001;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author junw
 */
@Controller
public class Demo0106Controller001 {
	// 为了数据安全
	// 上面所有的东西都是使用@RequestMapping来设置路径
	// 然后在不同的方法中，通过请求方式来区分具体执行哪个

	@RequestMapping(value = "/Users", method = RequestMethod.POST)
	@ResponseBody
	public String toSave(@RequestBody Demo0106DomainUser001 demo0106DomainUser001) {
		demorun.debug(""+demo0106DomainUser001);
		return "toSave 方法执行";
	}

	@RequestMapping(value = "/Users/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String toDelete(@PathVariable int id) {
		demorun.debug(""+id);
		return "toDelete 方法执行";
	}

	@RequestMapping(value = "/Users", method = RequestMethod.PUT)
	@ResponseBody
	public String toUpdate(@RequestBody Demo0106DomainUser001 demo0106DomainUser001) {
		demorun.debug(""+demo0106DomainUser001);
		return "toUpdate 方法执行";
	}

	@RequestMapping(value = "/Users/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String toGetById(@PathVariable int id) {
		demorun.debug(""+id);
		return "toGetById 方法执行";
	}
}
