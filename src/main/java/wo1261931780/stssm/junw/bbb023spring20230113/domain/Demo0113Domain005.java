package wo1261931780.stssm.junw.bbb023spring20230113.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Intellij IDEA.
 * Project:springBootDemo2
 * Package:com.example.springbootdemo2.domain
 *
 * @author liujiajun_junw
 * @Date 2023-01-10-01  星期五
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class Demo0113Domain005 {


	/**
	 * 主键
	 */
	@TableField(value = "id")
	private Integer id;


	/**
	 *
	 */
	@TableField(value = "name")
	private String name;

	/**
	 *
	 */
	@TableField(value = "password", select = false)
	private String password;

	/**
	 *
	 */
	@TableField(value = "age")
	private Integer age;

	/**
	 *
	 */
	@TableField(value = "tel")
	private String tel;

	/**
	 * 逻辑删除
	 * 0为默认值，存活
	 * 1为已经删除
	 */
	@TableField(value = "deleted")
	private Integer deleted;
	// @TableLogic(value = "0", delval = "1")
	// 我们如果在yml中已经完成了配置，那么这里就不需要设置这些东西
	/**
	 * 乐观锁
	 */
	@Version()
	private Integer version;
	// 乐观锁的本质，是在我们用户操作数据的时候，自动修改数据
	// 比如2000个人同时秒杀一个东西，如果一个人付钱成功
	// 那么version就会被修改为version+1
	// 然后剩下的人，如果version!=1
	// 那么就无法继续操作数据
	// 这里，实际上是mybatisPlus拦截了SQL，然后插入了一段SQL语句
	// 从这个角度出发，就需要我们手动添加一个拦截器来完成version的功能
}
