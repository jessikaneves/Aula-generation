package poo;

public class caneta {

	//CARACTERISTICAS -> ATRIBUTOS 
	
	private String cor;
	private double ponta;
	int carga;
	boolean tampada;
	
	//COMPORTAMENTOS -> METODOS 
	
	public void escrever()
	{
	   if(this.tampada==true)
		   System.out.println("Erro! Caneta tampada...");
	   else
		   System.out.println("Escrevendo... ");
    }
	
	public void tampar()
	{
	   this.tampada=true;
	}
	
	public void destampar()
	{
		 this.tampada=false;
	}
	
	public void estado()
	{
		// Estado
		System.out.println("Cor: "+this.cor);
		System.out.println("Ponta: "+this.ponta);
		System.out.println("Esta tampada?: "+this.tampada);
		System.out.println("  A carga esta em : "+this.carga);
	}
	
}
	
	