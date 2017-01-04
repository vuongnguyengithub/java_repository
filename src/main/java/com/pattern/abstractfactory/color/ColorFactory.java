package com.pattern.abstractfactory.color;

import com.pattern.abstractfactory.AbstractFactory;
import com.pattern.abstractfactory.shape.Shape;
import com.pattern.abstractfactory.shape.ShapeType;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType type) {
		return null;
	}

	@Override
	public Color getColor(ColorType type) {
		
		switch (type) {
		case BLUE:
			return new Blue();
		
		case GREEN:
			return new Green();
		
		case RED:
			return new Red();
			
		default:
			return null;
		}
	}
	

}
