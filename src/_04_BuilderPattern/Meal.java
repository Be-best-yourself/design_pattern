package _04_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
private List<Item> items  =new ArrayList<Item>();

public void addItem(Item item) {
	// TODO Auto-generated method stub
	items.add(item);
}
public float getCost() {
	float cost = 0.0f;
	for (Item item : items) {
		cost += item.price();
	}
	return cost;
}

public void showItems() {
	// TODO Auto-generated method stub
for (Item item : items) {
	System.out.println("item:"+item.name());
	System.out.println("Packing"+item.packing().pack());
	System.out.println("Price:"+item.price());
}
}
}
