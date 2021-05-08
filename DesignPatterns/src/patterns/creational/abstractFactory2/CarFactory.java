package patterns.creational.abstractFactory2;

import patterns.Utils.CarModel;

public interface CarFactory {
	public Car getCar(CarModel carModel);
}
