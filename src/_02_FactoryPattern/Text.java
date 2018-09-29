package _02_FactoryPattern;

public class Text {
public static void main(String[] args) {
	ShapeFactory shapeFactory = new ShapeFactory();
	Shape shape = shapeFactory.getShape("SQUARE");
	shape.draw();
}
}
