package patterns.structural.bridge2;

public abstract class Payment {
	public IPaymentSystem paymentGateway;
	public abstract void makepayment();
}
