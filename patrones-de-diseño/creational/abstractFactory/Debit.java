package abstractFactory;

public class Debit implements PaymentMethod {

	@Override
	public String doPayment() {
		return "PAGO A DEBITO";
	}

}
