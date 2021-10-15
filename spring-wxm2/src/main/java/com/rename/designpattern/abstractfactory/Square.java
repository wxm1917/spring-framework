package com.rename.designpattern.abstractfactory;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/15 下午2:17
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
