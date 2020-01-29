package factoryMethod;

public class PaymentFactory {
	
	public static PaymentInterface buildPayment(TypePayment typePayment) {

		switch (typePayment) {
		case GOOGLEPAY:
			return new GooglePayment();
		case CARD:
			return new CardPayment();
		default:
			return new CardPayment();
		}

	}
}
