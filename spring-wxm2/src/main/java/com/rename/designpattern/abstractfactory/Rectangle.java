package com.rename.designpattern.abstractfactory;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/15 下午2:16
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
