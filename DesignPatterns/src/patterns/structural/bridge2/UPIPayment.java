package patterns.structural.bridge2;

import patterns.Utils.PaymentMode;

public class UPIPayment extends Payment{

	@Override
	public void makepayment() {
		paymentGateway.processPayment(PaymentMode.UPI);		
	}

}
