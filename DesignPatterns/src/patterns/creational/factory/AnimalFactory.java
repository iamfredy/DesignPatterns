package patterns.creational.factory;

public class AnimalFactory {
	public static Animal getAnimal(String animal) {
		if("Dog".equalsIgnoreCase(animal)) {
			return new Dog();
		}
		else if("Cat".equalsIgnoreCase(animal)) {
			return new Cat();
		}
		return null;
	}
}
