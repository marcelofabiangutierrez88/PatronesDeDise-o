package main;

import abstractFactory.AbstractFactory;
import abstractFactory.Card;
import abstractFactory.FactoryProvaider;
import abstractFactory.PaymentMethod;
import builder.Card.CardBuilder;
import factoryMethod.PaymentFactory;
import factoryMethod.PaymentInterface;
import factoryMethod.TypePayment;

public class PatronesProgramacion {

	public static void main(String[] args) {
		
//		testFactoryMethod();
//		testAbstractFactory();
		testBuilder();

	}
	
//	private static void testFactoryMethod() {
//		
//		// Implementando patron factory del cual se parte de una interfaz donde se declara un metodo. 
//		// dos clases hacen la logica del tipo de pago. Luego se crea un factory donde por un enum
//		// se puede seleccionar el metodo de pago que se desea.
//	
//		
//		PaymentInterface payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
////		PaymentInterface payment = PaymentFactory.buildPayment(TypePayment.CARD);
//		
//		payment.doPayment();
//	}
	
	private static void testAbstractFactory () {
		
		//Implementando Abstract Factory como patron de diseño el cual permite elegir la factory de objetos a utilizar...
		
		AbstractFactory abstractFactory = FactoryProvaider.getFactory("Card");
		Card tarjeta = (Card) abstractFactory.create("VISA");
			
		AbstractFactory abstractFactory1 = FactoryProvaider.getFactory("PaymentMethod");
		PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");
		
		
		System.out.println("Una tarjeta de tipo "+ tarjeta.getCardType() + " Con el metodo de pago " + paymentMethod.doPayment() );
	}
	

	private static void testBuilder() {
		
		
		// patron de diseño builder
		
		builder.Card card = new CardBuilder("MASTERCARD", "0000 0000 0000 MASTER")
				.name("Marcelo").expires(2035).credit(true).build();
		
		System.out.println(card);
		
	}
	


}
