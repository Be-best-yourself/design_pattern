package _03_AFactoryPattern;

import _03_AFactoryPattern.Color.Color;

public abstract class AbstractFactory {
	 	public abstract Color getColor(String color);
	   public abstract Shape getShape(String shape) ;
}
