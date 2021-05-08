package patterns.creational.abstractFactory2;

import patterns.Utils.CarModel;

public class TataCarFactory implements CarFactory{

	@Override
	public Car getCar(CarModel carModel) {
		if(CarModel.ALTROZ.equals(carModel)) {
			return new Altroz();
		}
		else if(CarModel.HARRIER.equals(carModel)) {
			return new Harrier();
		}
		return null;
	}

}
