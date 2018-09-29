package _02_FactoryPattern;

public class Draw {
 public static void main(String[] args) {
	Shape rectangle = new Rectangle();
	rectangle.draw();
	Shape square = new Square();
	square.draw();
}
}
