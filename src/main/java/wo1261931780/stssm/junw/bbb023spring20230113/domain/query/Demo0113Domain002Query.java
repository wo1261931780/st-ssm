package com.stssm.github.io.junw.bbb023spring20230113.domain.query;

import com.stssm.github.io.junw.bbb023spring20230113.domain.Demo0113Domain002;
import lombok.Data;

/**
 * Created by Intellij IDEA.
 * Project:springBootDemo2
 * Package:com.example.springbootdemo2.domain.query
 *
 * @author liujiajun_junw
 * @Date 2023-01-13-03  星期五
 * @description
 */
@Data
public class Demo0113Domain002Query extends Demo0113Domain002 {
	// 这个类主要就是控制查询条件的，直接继承domain以后，就拿到domain中的变量
	// 然后设置条件即可

	/**
	 * 用来控制age范围的查询变量
	 */
	private Integer ageGt;

}
