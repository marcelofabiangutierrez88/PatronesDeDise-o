package abstractFactory;

public class Credit implements PaymentMethod{

	@Override
	public String doPayment() {
		return "PAGO A CREDITO";
	}

}
