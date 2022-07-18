package Polimorfismo;


	public class cachorro extends Animal implements Correr {
		public String Imprimir() {
			return "cachorro nome=" + nome + ", som=" + som + ", idade=" + idade ;
		}

		public void correndo() {
			System.out.println("Correndo");
		}

	}

