package com.rename.designpattern.abstractfactory;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/15 下午2:19
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType){
		return null;
	}

	@Override
	public Color getColor(String color) {
		if(color == null){
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		} else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		} else if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}
}
