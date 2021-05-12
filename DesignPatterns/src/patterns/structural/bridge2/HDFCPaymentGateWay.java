package patterns.structural.bridge2;

import patterns.Utils.PaymentMode;

public class HDFCPaymentGateWay implements IPaymentSystem {

	@Override
	public void processPayment(PaymentMode mode) {
		System.out.println("Using HDFC Payment Gateway for "+mode+" Payment.");
	}

}
