package com.stssm.github.io.junw.bbb019spring20230108.controller;

import com.stssm.github.io.junw.bbb019spring20230108.domain.Demo0108DomainTblBook;
import com.stssm.github.io.junw.bbb019spring20230108.service.Demo0108Service001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.DELETE_CODE_ERR;
import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.DELETE_CODE_OK;
import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.GET_QUERY_CODE_ERR;
import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.GET_QUERY_CODE_OK;
import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_INSERT_CODE_ERR;
import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_INSERT_CODE_OK;
import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_UPDATE_CODE_ERR;
import static com.stssm.github.io.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_UPDATE_CODE_OK;


/**
 * (TblBook)表控制层
 *
 * @author makejava
 * @since 2023-01-08 11:37:04
 */
@RestController
@RequestMapping("/TblBookController")
public class Demo0108BookController002 {
	// 这里注意一下，业务层的接口需要使用Junit去完成测试
	// 然后表现层的，需要使用postman做测试

	/**
	 * 服务对象
	 */
	@Autowired
	private Demo0108Service001 demo0108Service001;

	/**
	 * 新增数据
	 *
	 * @param demo0108DomainTblBook 实体
	 * @return 新增结果
	 */
	@PostMapping
	public Demo0108ResultController001 saveOne(@RequestBody Demo0108DomainTblBook demo0108DomainTblBook) {
		Boolean aBoolean = demo0108Service001.saveOne(demo0108DomainTblBook);
		// 我们默认返回的都是经过统一包装的返回体
		// 这样前端解析的时候就可以直接去拿data数据，
		// 同时，前端解析数据的时候，直接根据我们定义出来的标准消息，就可以判断请求是否成功
		return new Demo0108ResultController001(aBoolean, aBoolean.equals(Boolean.TRUE) ? POST_INSERT_CODE_OK : POST_INSERT_CODE_ERR);
	}

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("/{id}")
	public Demo0108ResultController001 queryById(@PathVariable Integer id) {
		Demo0108DomainTblBook demo0108DomainTblBook = demo0108Service001.queryById(id);
		return new Demo0108ResultController001(demo0108DomainTblBook, GET_QUERY_CODE_OK);
	}

	@GetMapping("/{id}")
	public Demo0108ResultController001 selectAll(@PathVariable Integer id) {
		List<Demo0108DomainTblBook> demo0108DomainTblBookList = demo0108Service001.selectAll(id);
		return new Demo0108ResultController001(demo0108DomainTblBookList, demo0108DomainTblBookList.size() == 0 ? GET_QUERY_CODE_OK : GET_QUERY_CODE_ERR);
	}

	/**
	 * 编辑数据
	 *
	 * @param demo0108DomainTblBook 实体
	 * @return 编辑结果
	 */
	@PutMapping
	public Demo0108ResultController001 update(@RequestBody Demo0108DomainTblBook demo0108DomainTblBook) {
		// 上面的实体类，都是从请求体中获取
		// 有的时候是json格式的字符串
		// 所以这里需要添加@RequestBody这个注解
		int update = demo0108Service001.update(demo0108DomainTblBook);
		return new Demo0108ResultController001(update, update == 0 ? POST_UPDATE_CODE_OK : POST_UPDATE_CODE_ERR);
	}

	/**
	 * 删除数据
	 *
	 * @param id 主键
	 * @return 删除是否成功
	 */
	@DeleteMapping("/{id}")
	public Demo0108ResultController001 deleteById(@PathVariable Integer id) {
		int id1 = demo0108Service001.deleteById(id);
		return new Demo0108ResultController001(id1, id1 == 0 ? DELETE_CODE_OK : DELETE_CODE_ERR);
	}
}
