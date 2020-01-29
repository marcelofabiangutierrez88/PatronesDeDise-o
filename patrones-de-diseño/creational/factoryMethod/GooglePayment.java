package factoryMethod;

public class GooglePayment implements PaymentInterface {

	@Override
	public void doPayment() {
		System.out.println("Pagando con Google");
		
	}

}
