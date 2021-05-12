package patterns.structural.bridge2;

import patterns.Utils.PaymentMode;

public interface IPaymentSystem {
	public void processPayment(PaymentMode mode);
}
