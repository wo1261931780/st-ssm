package wo1261931780.stssm.junw.bbb019spring20230108.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wo1261931780.stssm.junw.bbb019spring20230108.domain.Demo0108DomainTblBook;
import wo1261931780.stssm.junw.bbb019spring20230108.service.Demo0108Service001;

import java.util.List;


/**
 * (TblBook)表控制层
 *
 * @author makejava
 * @since 2023-01-08 11:37:04
 */
@RestController
@RequestMapping("/Demo0108BookController001")
public class Demo0108BookController001 {
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
	public Boolean saveOne(@RequestBody Demo0108DomainTblBook demo0108DomainTblBook) {
		Boolean aBoolean = demo0108Service001.saveOne(demo0108DomainTblBook);
		return aBoolean;
	}

	/**
	 * 通过主键查询单条数据
	 *
	 * @param id 主键
	 * @return 单条数据
	 */
	@GetMapping("/{id}")
	public Demo0108DomainTblBook queryById(@PathVariable Integer id) {
		Demo0108DomainTblBook demo0108DomainTblBook = demo0108Service001.queryById(id);
		return demo0108DomainTblBook;
	}

	@GetMapping("/{id}")
	public List<Demo0108DomainTblBook> selectAll(@PathVariable Integer id) {
		List<Demo0108DomainTblBook> demo0108DomainTblBookList = demo0108Service001.selectAll(id);
		return demo0108DomainTblBookList;
	}

	/**
	 * 编辑数据
	 *
	 * @param demo0108DomainTblBook 实体
	 * @return 编辑结果
	 */
	@PutMapping
	public Boolean update(@RequestBody Demo0108DomainTblBook demo0108DomainTblBook) {
		// 上面的实体类，都是从请求体中获取
		// 有的时候是json格式的字符串
		// 所以这里需要添加@RequestBody这个注解
		Boolean update = demo0108Service001.update(demo0108DomainTblBook);
		return update;
	}

	/**
	 * 删除数据
	 *
	 * @param id 主键
	 * @return 删除是否成功
	 */
	@DeleteMapping("/{id}")
	public Boolean deleteById(@PathVariable Integer id) {
		Boolean id1 = demo0108Service001.deleteById(id);
		return id1;
	}

	// 强调完表现层数据的封装模型以后，
	// 我们就大概确定了和前端人员，联调的结果
	// 根据封装好的模型，我们可以确定里面需要填充什么样的信息
	// 因为我们这里查询，get出来的结果，也全部都是给表现层使用的


	// /**
	//  * 分页查询
	//  *
	//  * @param tblBook 筛选条件
	//  * @param pageRequest      分页对象
	//  * @return 查询结果
	//  */
	// @GetMapping
	// public ResponseEntity<Page<Demo0108DomainTblBook>> queryByPage(Demo0108DomainTblBook demo0108DomainTblBook, PageRequest pageRequest) {
	//     return ResponseEntity.ok(this.demo0108Service001.queryByPage(demo0108DomainTblBook, pageRequest));
	// }
	//
	// /**
	//  * 通过主键查询单条数据
	//  *
	//  * @param id 主键
	//  * @return 单条数据
	//  */
	// @GetMapping("{id}")
	// public ResponseEntity<Demo0108DomainTblBook> queryById(@PathVariable("id") Integer id) {
	//     return ResponseEntity.ok(this.demo0108Service001.queryById(id));
	// }
	//
	// /**
	//  * 新增数据
	//  *
	//  * @param demo0108DomainTblBook 实体
	//  * @return 新增结果
	//  */
	// @PostMapping
	// public ResponseEntity<Demo0108DomainTblBook> add(Demo0108DomainTblBook demo0108DomainTblBook) {
	//     return ResponseEntity.ok(this.demo0108Service001.insert(demo0108DomainTblBook));
	// }
	//
	// /**
	//  * 编辑数据
	//  *
	//  * @param demo0108DomainTblBook 实体
	//  * @return 编辑结果
	//  */
	// @PutMapping
	// public ResponseEntity<Demo0108DomainTblBook> edit(Demo0108DomainTblBook demo0108DomainTblBook) {
	//     return ResponseEntity.ok(this.demo0108Service001.update(demo0108DomainTblBook));
	// }
	//
	// /**
	//  * 删除数据
	//  *
	//  * @param id 主键
	//  * @return 删除是否成功
	//  */
	// @DeleteMapping
	// public ResponseEntity<Boolean> deleteById(Integer id) {
	//     return ResponseEntity.ok(this.demo0108Service001.deleteById(id));
// }
}
