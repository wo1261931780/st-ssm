package wo1261931780.stssm.junw.bbb023spring20230113.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import wo1261931780.stssm.junw.bbb023spring20230113.domain.Demo0113Domain001;

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
public interface Demo0113UserDao002 extends BaseMapper<Demo0113Domain001> {
	// 使用mybatisPlus开发，直接继承，然后写一个实体类名，我们就开发完了
}
