package wo1261931780.stssm.junw.bbb023spring20230113.dao;

import com.stssm.github.io.junw.bbb023spring20230113.domain.Demo0113Domain001;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Intellij IDEA.
 * Project:springBootDemo2
 * Package:com.example.springbootdemo2.dao
 *
 * @author liujiajun_junw
 * @Date 2023-01-09-29  星期五
 * @description
 */
@Mapper
public interface Demo0113UserDao001 {

	/**
	 * 根据id获取一个对象
	 *
	 * @param id id
	 * @return 对象
	 */
	@Select("select * from mybatisplus_db.tbl_user where id=#{id,jdbcType=INTEGER};")
	Demo0113Domain001 getOneById(Integer id);
	// 这是原始的mybatis开发模式
}
