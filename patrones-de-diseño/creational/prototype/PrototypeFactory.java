package prototype;

import java.util.HashMap;
import java.util.Map;


public class PrototypeFactory {
	
	public static class CardType{
		public static final String VISA = "visa";
		public static final String AMEX = "amex";
			
		}

//	public static final String VISA = "visa";
//	public static final String AMEX = "amex";
	
	private static Map<String, PrototypeCard> prototypes = new HashMap<>();
	public static PrototypeCard getInstance (final String tipo)
	throws CloneNotSupportedException{
		return prototypes.get(tipo).clone();
		
	}
	public static void loadCard() {
		Visa visa = new Visa();
		visa.setName("Esta es una tarjeta visa nro ....");
		prototypes.put(PrototypeFactory.CardType.VISA, visa);
		
		Amex amex = new Amex();
		amex.setName("Esta es una tarjeta amex nro ....");
		prototypes.put(PrototypeFactory.CardType.AMEX, amex);
		
	}
	

}
