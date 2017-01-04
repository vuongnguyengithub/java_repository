package com.pattern.abstractfactory.shape;

import com.pattern.abstractfactory.AbstractFactory;
import com.pattern.abstractfactory.color.Color;
import com.pattern.abstractfactory.color.ColorType;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType type) {
		
		switch (type) {		
		case CIRCLE:
			return new Circle();
			
		case SQUARE:
			return new Square();
			
		default:
			return null;
		}
	}

	@Override
	public Color getColor(ColorType type) {
		return null;
	}
	
	
}
