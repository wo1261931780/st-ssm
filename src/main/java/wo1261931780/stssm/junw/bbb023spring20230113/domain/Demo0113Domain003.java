package com.stssm.github.io.junw.bbb023spring20230113.domain;

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
@TableName("tbl_user")
public class Demo0113Domain003 {
	// 这里其实还是同一个表
	// 只不过这里添加了若干的注解，表示和前表的关联关系


	/**
	 * 当我们的后台程序，和实际数据库中的字段不一致的时候，
	 * 直接使用TableField把两个字段关联起来
	 */
	@TableField(value = "id")
	private Integer id;

	/**
	 *
	 */
	@TableField(value = "name")
	private String name;

	/**
	 * 因为是密码，如果作为数据参与传递，有泄露的风险
	 * 所以这里不能使用
	 * 添加select = false不参与查询
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
	 * 是否在线
	 * 这是我们程序中的字段，在数据库中不存在，所以设置不参与查询exist = false
	 */
	@TableField(value = "online", exist = false)
	private String online;
}
