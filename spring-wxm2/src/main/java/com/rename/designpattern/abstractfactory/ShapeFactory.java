package com.rename.designpattern.abstractfactory;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/15 下午2:18
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
