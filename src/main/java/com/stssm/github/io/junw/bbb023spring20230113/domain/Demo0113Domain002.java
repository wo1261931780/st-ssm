package com.stssm.github.io.junw.bbb023spring20230113.domain;

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
public class Demo0113Domain002 {
	// 直接使用lombok的get和set注解
	// 后面所有的set和get都不需要额外添加
	// 有一个更加简单的注解：
	// @Setter
	// @Getter
	// @ToString
	// @NoArgsConstructor
	// @AllArgsConstructor
	// @EqualsAndHashCode
	// 使用@data,就将上面的所有注解全部替代掉了


	/**
	 *
	 */
	private Integer id;

	/**
	 *
	 */
	private String name;

	/**
	 *
	 */
	private String password;

	/**
	 *
	 */
	private Integer age;

	/**
	 *
	 */
	private String tel;
}
