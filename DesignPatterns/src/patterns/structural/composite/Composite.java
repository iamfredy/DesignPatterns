package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	String name;
	public Composite(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	int cost;
	List<Component> children=new ArrayList<>();
	public void addComponent(Component child) {
		this.children.add(child);
	}
	
	@Override
	public void showCost() {
		System.out.println("--------"+name+" : "+cost+"-----------");
		for(Component child:children) {
			child.showCost();
		}
	}

}
