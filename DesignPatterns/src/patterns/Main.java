package patterns;

import patterns.creational.factory.Animal;
import patterns.creational.factory.AnimalFactory;
import patterns.creational.singleton.Singleton;

public class Main {
	public static void main(String[] args) {		
		singletonDesignPattern();
		factoryDesignPattern();
	}

	private static void factoryDesignPattern() {
		Animal animal=AnimalFactory.getAnimal("dog");
		animal.move();
		animal.speak();
		
		animal=AnimalFactory.getAnimal("cat");
		animal.move();
		animal.speak();
	}

	private static void singletonDesignPattern() {
//		Only the Object is initialized once, hence the Obj1 and Obj2 will be same.
		Singleton obj1=Singleton.getInstance();
		System.out.println("Obj1: "+obj1);
		
		Singleton obj2=Singleton.getInstance();
		System.out.println("Obj2: "+obj2);
		
		
	}
}
