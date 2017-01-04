package com.pattern.abstractfactory;

import com.pattern.abstractfactory.color.ColorFactory;
import com.pattern.abstractfactory.shape.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(Choice choice) {
		switch (choice) {
		case COLOR:
			return new ColorFactory();
		case SHAPE:
			return new ShapeFactory();
		default:
			return null;
		}
	}
}
