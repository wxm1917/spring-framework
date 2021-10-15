package com.rename.designpattern.abstractfactory;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/15 下午2:19
 */
public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
}

