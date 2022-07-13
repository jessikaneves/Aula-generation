package Heranca;

public class Animal {
	//Atributos
	
     private int patas;
     private String revestimento;
     
 
     //Metodos
     
     public void movimento()
     {
    	 System.out.println("Movimento...");
     }



	public int getPatas() {
		return patas;
	}



	public void setPatas(int patas) {
		this.patas = patas;
	}



	public String getRevestimento() {
		return revestimento;
	}



	public void setRevestimento(String revestimento) {
		this.revestimento = revestimento;
	}
     
}
