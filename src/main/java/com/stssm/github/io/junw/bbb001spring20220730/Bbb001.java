package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.service.BookService;
import com.stssm.github.io.service.impl.BookServiceImpl;

/**
 * Created by Intellij IDEA.
 * Project:st-ssm.github.io
 * Package:com.stssm.github.io.stssm.github.io
 *
 * @param
 * @author liujiajun_junw
 * @Date 2022-07-15-29  星期六
 * @description
 * @return
 * @exception
 */
public class Bbb001 {
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		bookService.serviceShow();
		// 这里都是在没有设置的情况下，运行类的方法
	}
}
