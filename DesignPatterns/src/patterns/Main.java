package patterns;

import patterns.Utils.CarCompany;
import patterns.Utils.CarModel;
import patterns.creational.abstractFactory.GUI;
import patterns.creational.abstractFactory.IButton;
import patterns.creational.abstractFactory.IGUIFactory;
import patterns.creational.abstractFactory2.Car;
import patterns.creational.abstractFactory2.CarFactory;
import patterns.creational.abstractFactory2.CarFactoryProducer;
import patterns.creational.builder.User;
import patterns.creational.builder.Vehicle;
import patterns.creational.builder.VehicleBuilder;
import patterns.creational.factory.Animal;
import patterns.creational.factory.AnimalFactory;
import patterns.creational.prototype.MarklistWithDeepCloning;
import patterns.creational.prototype.MarklistWithShallowCloning;
import patterns.creational.singleton.Singleton;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {		
//		singletonDesignPattern();
//		factoryDesignPattern();
		abstractFactoryPattern();
//		builderPattern();
//		prototypePattern();
		
	}

	private static void abstractFactoryPattern() {

		IGUIFactory guiFactory=GUI.getGUIFactory("macos");
		IButton button=guiFactory.getButton();
		button.displayButtonInUI();
		guiFactory.getCheckBox().renderCheckBoxinUI();
		guiFactory=GUI.getGUIFactory("windows");
		guiFactory.getButton().displayButtonInUI();
		guiFactory.getCheckBox().renderCheckBoxinUI();
		
		//Abstract Factory 
		CarFactory tataCarFactory=CarFactoryProducer.getCarFactory(CarCompany.TATA);
		Car harrier=tataCarFactory.getCar(CarModel.HARRIER);
		harrier.drive();
		Car altroz=tataCarFactory.getCar(CarModel.ALTROZ);
		altroz.drive();
		
		CarFactory hondaCarFactory=CarFactoryProducer.getCarFactory(CarCompany.HONDA);
		Car brio=hondaCarFactory.getCar(CarModel.BRIO);
		brio.drive();
		Car city=hondaCarFactory.getCar(CarModel.CITY);
		city.drive();
		
/**Displaying MacOS Button in the UI
Displaying MacOS CheckBox in the UI
Displaying Windows Button in the UI
Displaying Windows Button in the UI
Driving in Tata Harrier
Driving in Tata Altroz
Driving in Honda Brio
Driving in Honda City
*/		
	}

	private static void prototypePattern() throws CloneNotSupportedException {

		
		System.out.println("-----------Deep Cloning Start------------------");
		/**In Deep Cloning - Original Obj and Cloned Obj will have different References*/
		MarklistWithDeepCloning marklistOriginal=new MarklistWithDeepCloning("Deep Clone");
		System.out.println("Original Marklist: "+marklistOriginal);
		
		MarklistWithDeepCloning markListCopy=marklistOriginal.clone();
		System.out.println("Cloning Completed");

		marklistOriginal.subjects.remove(1);
		System.out.println("Removed Subject 1 from Original");
		System.out.println("Original marklist after removal of a Subject: "+marklistOriginal);
		System.out.println("Copy of Original MarkLst: "+markListCopy);
		System.out.println("-----------Deep Cloning End------------------");
		
		
		System.out.println("-----------Shallow Cloning Start------------------");
		/** Shallow Cloning using Cloneable - In Shallow Cloning, Original and Cloned Obj References will be same **/
		MarklistWithShallowCloning shallowMarkListOriginal=new MarklistWithShallowCloning("Shallow Clone");
		System.out.println("Shallow-Original Marklist: "+shallowMarkListOriginal);
		MarklistWithShallowCloning shallowMarkListCopy=(MarklistWithShallowCloning) shallowMarkListOriginal.clone();
		System.out.println("Cloning Completed");

		shallowMarkListOriginal.subjects.remove(1);
		System.out.println("Removed Subject 1 from Original");
		System.out.println("Original marklist after removal of a Subject: "+shallowMarkListOriginal);
		System.out.println("Copy of Original MarkLst: "+shallowMarkListCopy);
		System.out.println("-----------Shallow Cloning End------------------");

		/***
		 * 
		 * Results
		 * -----------Deep Cloning Start------------------
Original Marklist: Student Name: Deep Clone [Subjects: [{ Subject0:100}, { Subject1:99}, { Subject2:98}] ]
Cloning Completed
Removed Subject 1 from Original
Original marklist after removal of a Subject: Student Name: Deep Clone [Subjects: [{ Subject0:100}, { Subject2:98}] ]
Copy of Original MarkLst: Student Name: Deep Clone [Subjects: [{ Subject0:100}, { Subject1:99}, { Subject2:98}] ]
-----------Deep Cloning End------------------
-----------Shallow Cloning Start------------------
Shallow-Original Marklist: Student Name: Shallow Clone [Subjects: [{ Subject0:100}, { Subject1:99}, { Subject2:98}] ]
Cloning Completed
Removed Subject 1 from Original
Original marklist after removal of a Subject: Student Name: Shallow Clone [Subjects: [{ Subject0:100}, { Subject2:98}] ]
Copy of Original MarkLst: Student Name: Shallow Clone [Subjects: [{ Subject0:100}, { Subject2:98}] ]
-----------Shallow Cloning End------------------

		 */
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
