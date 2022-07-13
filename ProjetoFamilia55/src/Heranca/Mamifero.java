package Heranca;

public class Mamifero extends Animal {
    private String corDopelo;
    private String ComprimentoDoPelo;
    
    
    //comportamento
    
    public void mamar()
    {
    	System.out.println("Mamando..");
    }


	public String getCorDopelo() {
		return corDopelo;
	}


	public void setCorDopelo(String corDopelo) {
		this.corDopelo = corDopelo;
	}


	public String getComprimentoDoPelo() {
		return ComprimentoDoPelo;
	}


	public void setComprimentoDoPelo(String comprimentoDoPelo) {
		ComprimentoDoPelo = comprimentoDoPelo;
	}
    
    
}
