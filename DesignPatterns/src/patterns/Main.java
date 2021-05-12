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
import patterns.structural.adapter.CovidAPIAdapter;
import patterns.structural.adapter.CovidAPINewImpl;
import patterns.structural.adapter.CovidAPIOldImpl;
import patterns.structural.adapter.CovidOldAPI;
import patterns.structural.bridge.viewableentities.ViewableAgent;
import patterns.structural.bridge.viewableentities.ViewableEntity;
import patterns.structural.bridge.viewableentities.ViewableTeam;
import patterns.structural.bridge.views.DetailView;
import patterns.structural.bridge.views.ListView;
import patterns.structural.bridge.views.View;
import patterns.structural.bridge2.CardPayment;
import patterns.structural.bridge2.CitiBankPaymentGateway;
import patterns.structural.bridge2.HDFCPaymentGateWay;
import patterns.structural.bridge2.Payment;
import patterns.structural.bridge2.UPIPayment;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {	
		/**Creational Design Pattern Start**/
//		singletonDesignPattern();
//		factoryDesignPattern();
//		abstractFactoryPattern();
//		builderPattern();
//		prototypePattern();
//		
//		/**Structural Design Pattern Start**/
//		adapterPatternAKAWrapper();
		bridgePattern();
		
	}

	private static void bridgePattern() {
		
		Payment payment=new CardPayment();
		payment.paymentGateway=new CitiBankPaymentGateway();
		payment.makepayment();
		
		payment=new UPIPayment();
		payment.paymentGateway=new HDFCPaymentGateWay();
		payment.makepayment();
		
		
		//Agent List View
		ViewableEntity entity=new ViewableAgent("Fredric", "Member Techical Staff-Zoho Desk", "zohodesk/automtionteam/fred.jpg");
		View view=new ListView(entity);
		view.display();
		//Agent Detail View
		view=new DetailView(entity);
		view.display();
		
		
		//Team ListView
		entity=new ViewableTeam("Automation Team", "zohodesk/atomationteam/teamlogo.jpg");
		view=new ListView(entity);
		view.display();
		//Team Detail View
		view=new DetailView(entity);
		view.display();
/**
 * 
 * *****List View For Agent***************************
*****Name            :Fredric
*****Logo            :zohodesk/automtionteam/fred.jpg
*****Last Modified On:2021-05-12T19:31:29.799Z
**************************************************
****Detail View For Agent***************************
*****Name             :Fredric
*****Description      :Member Techical Staff-Zoho Desk
*****Logo             :zohodesk/automtionteam/fred.jpg
*****Last Modified On :2021-05-12T19:31:29.799Z
*****Created On       :2021-05-12T19:25:29.799Z
**************************************************
*****List View For Team***************************
*****Name            :Automation Team
*****Logo            :zohodesk/atomationteam/teamlogo.jpg
*****Last Modified On:2021-05-12T19:28:39.039Z
**************************************************
****Detail View For Team***************************
*****Name             :Automation Team
*****Description      :Team Name is : Automation Team and Created on 2021-05-12T19:25:29.826Z
*****Logo             :zohodesk/atomationteam/teamlogo.jpg
*****Last Modified On :2021-05-12T19:28:39.039Z
*****Created On       :2021-05-12T19:25:29.826Z
**************************************************
 * 		
 */

	}

	private static void adapterPatternAKAWrapper() {
		CovidOldAPI oldAPI=new CovidAPIOldImpl();
		String response=oldAPI.data();
		System.out.println("OLD API Response: "+response);
		
		oldAPI=new CovidAPIAdapter(new CovidAPINewImpl());
		response=oldAPI.data();
		System.out.println("New API Response in Expected format of Old API via Wrapper: "+response);
		
		
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
