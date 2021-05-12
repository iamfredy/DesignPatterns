package patterns.structural.bridge2;

import patterns.Utils.PaymentMode;

public class NetBankingPayment extends Payment{
	@Override
	public void makepayment() {
		paymentGateway.processPayment(PaymentMode.CARD);		
	}
}
