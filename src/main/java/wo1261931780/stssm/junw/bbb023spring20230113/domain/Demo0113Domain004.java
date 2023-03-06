package wo1261931780.stssm.junw.bbb023spring20230113.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
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
public class Demo0113Domain004 {


	/**
	 * type = IdType.AUTO
	 * 主键的生成策略，按照数据库设置的策略即可
	 */
	@TableField(value = "id")
	private Integer id;
	// 需要说明一下：
	// 如果不是auto，数据库中就不能设置自动递增id，否则会报错
	// 这里IdType.INPUT，就要求我们一定要输入一个id值过去，否则不行
	// 继续说明IdType.ASSIGN_ID
	// 这里的ID是自动生成的，不是我们手动给的
	// 如果使用这个类型的id，那么我们可以自己设置，也可以不设置，然后让它自己生成一个随机的id
	// @TableId(type = IdType.ASSIGN_ID)


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
	 *
	 */
	@TableField(value = "online", exist = false)
	private String online;
}
