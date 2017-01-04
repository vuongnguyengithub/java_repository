package com.pattern.abstractfactory;

import com.pattern.abstractfactory.color.Color;
import com.pattern.abstractfactory.color.ColorType;
import com.pattern.abstractfactory.shape.Shape;
import com.pattern.abstractfactory.shape.ShapeType;

public class Runner {
	public static void main(String ...strings) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(Choice.SHAPE);
		Shape square = shapeFactory.getShape(ShapeType.SQUARE);
		Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
		square.draw();
		circle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory(Choice.COLOR);
		Color green =  colorFactory.getColor(ColorType.GREEN);
		Color red =  colorFactory.getColor(ColorType.RED);
		green.fill();
		red.fill();
	}
}
