package factoryMethod;

public class CardPayment implements PaymentInterface {

	@Override
	public void doPayment() {
		System.out.println("Pagando con Tarjeta");	
		
	}
	

}
