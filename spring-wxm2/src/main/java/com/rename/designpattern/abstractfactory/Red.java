package com.rename.designpattern.abstractfactory;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/15 下午2:17
 */
public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
