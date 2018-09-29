package _04_BuilderPattern;

public abstract class Burger implements Item{

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Warpper();
	}
	@Override
	public abstract float price();
}

