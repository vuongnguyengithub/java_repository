package com.pattern.abstractfactory;

import com.pattern.abstractfactory.color.Color;
import com.pattern.abstractfactory.color.ColorType;
import com.pattern.abstractfactory.shape.Shape;
import com.pattern.abstractfactory.shape.ShapeType;

public abstract class AbstractFactory {
	public abstract Shape getShape(ShapeType type);
	public abstract Color getColor(ColorType type);
}
