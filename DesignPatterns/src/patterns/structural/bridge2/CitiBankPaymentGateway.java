package patterns.structural.bridge2;

import patterns.Utils.PaymentMode;

public class CitiBankPaymentGateway implements IPaymentSystem{

	@Override
	public void processPayment(PaymentMode mode) {
		System.out.println("Using Citi Payment Gateway for "+mode+" Payment.");		
	}

}
