package _03_AFactoryPattern;

import _03_AFactoryPattern.Color.Blue;
import _03_AFactoryPattern.Color.Color;
import _03_AFactoryPattern.Color.Green;
import _03_AFactoryPattern.Color.Red;

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