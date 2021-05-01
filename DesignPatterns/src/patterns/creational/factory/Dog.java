package patterns.creational.factory;

public class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Bow! Bow! Bow!");
	}

	@Override
	public void move() {
		System.out.println("Run like a dog!");
	}

}
