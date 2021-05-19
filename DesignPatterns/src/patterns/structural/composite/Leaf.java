package patterns.structural.composite;

public class Leaf implements Component {

	String name;
	int cost;
	@Override
	public void showCost() {
		System.out.println(name+" : "+cost);
	}
	public Leaf(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

}
