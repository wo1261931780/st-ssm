package com.stssm.github.io.junw.bbb018spring20230106.controller;

import com.stssm.github.io.junw.bbb018spring20230106.doamin.Demo0106DomainBook001;
import com.stssm.github.io.junw.bbb018spring20230106.doamin.Demo0106DomainUser001;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Users")
public class Demo0106Controller003 {

	@PostMapping
	public String toSave(@RequestBody Demo0106DomainUser001 demo0106DomainUser001) {
		System.out.println(demo0106DomainUser001);
		return "toSave 方法执行";
	}

	@GetMapping("/{name}")
	public List<Demo0106DomainBook001> toGetAll(@RequestBody String name) {
		Demo0106DomainBook001 book001 = new Demo0106DomainBook001();
		book001.setBookName("name1");
		book001.setBookPrice(11);
		Demo0106DomainBook001 book002 = new Demo0106DomainBook001();
		book002.setBookName("name2");
		book002.setBookPrice(22);
		List<Demo0106DomainBook001> demo0106DomainBook001List = new ArrayList<>();
		demo0106DomainBook001List.add(book001);
		demo0106DomainBook001List.add(book002);
		return demo0106DomainBook001List;
	}
}
