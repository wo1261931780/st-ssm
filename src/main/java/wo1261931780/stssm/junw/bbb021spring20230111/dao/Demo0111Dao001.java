package wo1261931780.stssm.junw.bbb021spring20230111.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import wo1261931780.stssm.junw.bbb021spring20230111.domain.Demo0111Domain001;

/**
 * @author junw
 */
@Mapper
public interface Demo0111Dao001 {
	// 这里的Mapper，也就是需要给spring去完成管理
	// 而mapper的意思，就是数据库查询

	/**
	 * 根据id查询结果
	 *
	 * @param id id
	 * @return 返回结果
	 */
	@Select("select * from tbl_book where id=#{id}")
	Demo0111Domain001 getById(Integer id);
}
