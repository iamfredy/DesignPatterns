package patterns.creational.builder;

public class VehicleBuilder {
	String type;
	Long id;
	String name;
	int wheels;
	String color;
	int topSpeed;
	public VehicleBuilder setType(String type) {
		this.type = type;
		return this;
	}
	public VehicleBuilder setId(Long id) {
		this.id = id;
		return this;
	}
	public VehicleBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public VehicleBuilder setWheels(int wheels) {
		this.wheels = wheels;
		return this;
	}
	public VehicleBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	public VehicleBuilder setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
		return this;
	}
	
	public Vehicle build() {
		return new Vehicle(this.type, this.id, this.name, this.wheels, this.color, this.topSpeed);
	}
	
	
}
