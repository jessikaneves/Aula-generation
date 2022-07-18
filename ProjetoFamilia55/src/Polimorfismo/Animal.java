package Polimorfismo;

public class Animal {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo();
		cachorro cachorro = new cachorro();
		Preguica preguica = new Preguica();
		
		cavalo.setIdade(25);
		cavalo.setNome("Nick");
		cavalo.setSom(true);
		System.out.println(cavalo.Imprimir());
		
		cachorro.setIdade(3);
		cachorro.setNome("Saphira");
		cachorro.setSom(false);
		
		System.out.println(cachorro.Imprimir());
		
		preguica.setIdade(29);
		preguica.setNome("Jessika");
		preguica.setSom(true);
		
		System.out.println(preguica.Imprimir());
	}

}


