package patterns.creational.abstractFactory2;

import patterns.Utils.CarCompany;

public class CarFactoryProducer {
	public static CarFactory getCarFactory(CarCompany company) {
		if(company.equals(CarCompany.HONDA)) {
			return new HondaCarFactory();
		}
		else if(company.equals(CarCompany.TATA)) {
			return new TataCarFactory();
		}
		return null;
		
	}
}
