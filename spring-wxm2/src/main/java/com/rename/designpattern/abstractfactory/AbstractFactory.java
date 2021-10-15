package com.rename.designpattern.abstractfactory;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/15 下午2:18
 */
public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}
