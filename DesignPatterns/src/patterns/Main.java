package patterns;

import patterns.creational.singleton.Singleton;

public class Main {
	public static void main(String[] args) {		
		singletonDesignPattern();
	}

	private static void singletonDesignPattern() {
//		Only the Object is initialized once, hence the Obj1 and Obj2 will be same.
		Singleton obj1=Singleton.getInstance();
		System.out.println("Obj1: "+obj1);
		
		Singleton obj2=Singleton.getInstance();
		System.out.println("Obj2: "+obj2);
		
		
	}
}
