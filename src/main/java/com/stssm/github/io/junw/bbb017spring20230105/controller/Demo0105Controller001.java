package com.stssm.github.io.junw.bbb017spring20230105.controller;

import com.stssm.github.io.junw.bbb017spring20230105.domain.Demo0105DomainUser001;
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
public class Demo0105Controller001 {
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public String toInsert(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		System.out.println("我是Demo0105Controller001中的toInsert方法");
		return "";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String toDelete(@PathVariable int id) {
		System.out.println("我是Demo0105Controller001中的toDelete方法");
		// 这里是将post变量，放入路径中进行解析
		return "";
	}

	@RequestMapping(value = "/change", method = RequestMethod.POST)
	@ResponseBody
	public String toChange(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		System.out.println("我是Demo0105Controller001中的toChange方法");
		return "";
	}

	@RequestMapping(value = "/getOne", method = RequestMethod.GET)
	@ResponseBody
	public String toGetOneById(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		System.out.println("我是Demo0105Controller001中的toGetOneById方法");
		return "";
	}

	@RequestMapping(value = "/query", method = RequestMethod.GET)
	@ResponseBody
	public String toQuery(@RequestBody Demo0105DomainUser001 demo0105DomainUser001) {
		System.out.println("我是Demo0105Controller001中的toQuery方法");
		return "";
	}
}
