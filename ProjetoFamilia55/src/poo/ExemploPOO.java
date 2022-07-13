package poo;

public class ExemploPOO {

	public static void main(String[] args) {
		caneta bic = new caneta();
		caneta kilometrica = new caneta();
		
		System.out.println("Caneta bic");
		bic.cor="azul";
		bic.estado();
		
		System.out.println("\nCaneta kilometrica");
		kilometrica.estado();

	}

}
