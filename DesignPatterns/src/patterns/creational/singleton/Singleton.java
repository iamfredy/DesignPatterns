package patterns.creational.singleton;

public class Singleton {
	private static Singleton instance=null;
	
	//Constructor is made private to prevent external initialization
	private Singleton() {
		//Code to initailize the properties
	}
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();//Lazy Initialization
		}
		return instance;
	}
	
}
