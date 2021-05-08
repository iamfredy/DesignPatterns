package patterns.creational.abstractFactory2;

public class City implements Car {

	protected City() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void drive() {
		System.out.println("Driving in Honda City");
	}

}
