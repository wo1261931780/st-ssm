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

import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.DELETE_CODE_ERR;
import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.DELETE_CODE_OK;
import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.GET_QUERY_CODE_ERR;
import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.GET_QUERY_CODE_OK;
import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_INSERT_CODE_ERR;
import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_INSERT_CODE_OK;
import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_UPDATE_CODE_ERR;
import static wo1261931780.stssm.junw.bbb019spring20230108.controller.Demo0108CodeController001.POST_UPDATE_CODE_OK;


/**
 * (TblBook)表控制层
 *
 * @author makejava
 * @since 2023-01-08 11:37:04
 */
@RestController
@RequestMapping("/Demo0108BookController002")
public class Demo0108BookController002 {

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
		Integer integer = demo0108DomainTblBook != null ? GET_QUERY_CODE_OK : GET_QUERY_CODE_ERR;
		String returnMsg = demo0108DomainTblBook != null ? "查询成功" : "查询失败";
		Demo0108ResultController001 resultController001 = new Demo0108ResultController001();
		resultController001.setReturnCode(integer);
		resultController001.setReturnMessage(returnMsg);
		resultController001.setReturnData(demo0108DomainTblBook);
		return resultController001;
	}

	@GetMapping("/{id}")
	public Demo0108ResultController001 selectAll(@PathVariable Integer id) {
		List<Demo0108DomainTblBook> demo0108DomainTblBookList = demo0108Service001.selectAll(id);
		Demo0108ResultController001 resultController001 = new Demo0108ResultController001();
		resultController001.setReturnData(resultController001);
		resultController001.setReturnMessage(demo0108DomainTblBookList != null ? "查询列表成功" : "查询列表失败");
		resultController001.setReturnCode(demo0108DomainTblBookList != null ? GET_QUERY_CODE_OK : GET_QUERY_CODE_ERR);
		return resultController001;
	}

	/**
	 * 编辑数据
	 *
	 * @param demo0108DomainTblBook 实体
	 * @return 编辑结果
	 */
	@PutMapping
	public Demo0108ResultController001 update(@RequestBody Demo0108DomainTblBook demo0108DomainTblBook) {
		Boolean update = demo0108Service001.update(demo0108DomainTblBook);
		// return new Demo0108ResultController001(update, update == 0 ? POST_UPDATE_CODE_OK : POST_UPDATE_CODE_ERR);
		return new Demo0108ResultController001(update, update ? POST_UPDATE_CODE_OK : POST_UPDATE_CODE_ERR);
	}

	/**
	 * 删除数据
	 *
	 * @param id 主键
	 * @return 删除是否成功
	 */
	@DeleteMapping("/{id}")
	public Demo0108ResultController001 deleteById(@PathVariable Integer id) {
		Boolean id1 = demo0108Service001.deleteById(id);
		return new Demo0108ResultController001(id1, id1 ? DELETE_CODE_OK : DELETE_CODE_ERR);
	}
}
