package listaPOO1;

public class patinete_objeto {

		public static void main(String[] args) {
		       Patinete frog = new Patinete(" Rosa ", 35.0);
		       Patinete led = new Patinete ("Azul", 50.5);
		       Patinete xiaomi = new Patinete (" Preto ", 100.0);
		   
		       
		       System.out.println("Patinete frog");
		       frog.setQuantidadesderodas(3);
		       frog.naoeletrico();
		       frog.estado();
		    
		       
		       System.out.println("\nPatinete led");
		       led.setQuantidadesderodas(2);
		       led.naoeletrico();
		       led.estado();
		       
		       System.out.println("\nPatinete xiaomi");
		       xiaomi.setQuantidadesderodas(2);
		       xiaomi.eletrico();
		       xiaomi.estado();
		       
	}

}
