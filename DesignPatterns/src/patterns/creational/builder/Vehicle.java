package patterns.creational.builder;

public class Vehicle {
	String type;
	Long id;
	String name;
	int wheels;
	String color;
	int topSpeed;
	
	public String toString() {
		return "Type: "+this.type+" ID: "+this.id+" Name: "+this.name+" Color: "+this.color+" TopSpeed: "+this.topSpeed+" Wheels: "+this.wheels;
	}
	Vehicle(String type,Long id,String name,int wheels,	String color,int topSpeed) {
		this.type= type;
		this.id= id;
		this.name= name;
		this.wheels= wheels;
		this.color =color;
		this.topSpeed= topSpeed;
	}
}
