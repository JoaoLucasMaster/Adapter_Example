package model;

public class BuracoFormatoRedondo {
	private double raio;
	
	public BuracoFormatoRedondo(double raio)
	{
		this.raio = raio;
	}
	
	public double getRaio()
	{
		return this.raio;
	}
	
	 public boolean encaixar(PinosRedondos pino) {
	        boolean resultado;
	        resultado = (this.getRaio() >= pino.getRaio());
	        return resultado;
	    }
}
