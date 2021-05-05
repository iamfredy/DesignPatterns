package patterns;

import patterns.creational.builder.User;
import patterns.creational.builder.Vehicle;
import patterns.creational.builder.VehicleBuilder;
import patterns.creational.factory.Animal;
import patterns.creational.factory.AnimalFactory;
import patterns.creational.singleton.Singleton;

public class Main {
	public static void main(String[] args) {		
		singletonDesignPattern();
		factoryDesignPattern();
		builderPattern();
	}

	private static void builderPattern() {
		User user=new User.Builder().setAge(10).build();
		user.printUserDetails();
		System.out.println(user);
		user=new User.Builder().setName("Fred").setPhoneNumber(123l).build();
		user.printUserDetails();
		System.out.println(user);
		
		//Second Type of Builder Implementation
		Vehicle vehicle=new VehicleBuilder().build();
		System.out.println(vehicle);
		vehicle=new VehicleBuilder().setName("Ford").setWheels(4).build();
		System.out.println(vehicle);
		vehicle=new VehicleBuilder().setName("BMW").setTopSpeed(200).setColor("Red").build();
		System.out.println(vehicle);


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
