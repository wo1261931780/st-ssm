package com.stssm.github.io.junw.bbb001spring20220730;

import com.stssm.github.io.junw.bbb001spring20220730.service.BookService0730;
import com.stssm.github.io.junw.bbb001spring20220730.service.Impl.BookService0730Impl;

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
		BookService0730 bookService0730 = new BookService0730Impl();
		bookService0730.serviceShow();
		// 这里都是在没有设置的情况下，运行类的方法
	}
}
