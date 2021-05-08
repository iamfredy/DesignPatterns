package patterns.creational.abstractFactory2;

import patterns.Utils.CarModel;

public class HondaCarFactory implements CarFactory{

	@Override
	public Car getCar(CarModel carModel) {
		if(CarModel.BRIO.equals(carModel)) {
			return new Brio();
		}
		else if(CarModel.CITY.equals(carModel)) {
			return new City();
		}
		return null;
	}


}
