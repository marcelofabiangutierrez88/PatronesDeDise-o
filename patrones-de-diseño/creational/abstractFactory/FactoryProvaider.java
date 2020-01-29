package abstractFactory;

public class FactoryProvaider {
	public static AbstractFactory getFactory (String chooseFactory) {
		if("Card".equals(chooseFactory)){
			return new CardFactory();
		}else if ("PaymentMethod".equals(chooseFactory)) {
			return new PaymentMethodFactory();
		}
		
		return null;
		
	}

}
