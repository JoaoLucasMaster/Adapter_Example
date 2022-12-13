
public class AdapterCotacao extends Cotacao{
	
	
	@Override
	public void setValor(double valor) {
		super.setValor(valor/5);
	}
	
	@Override 
	public double getValor() {
		return (super.getValor() * 5);
	}
	
	public double getValorDolar()
	{
		return super.getValor();
	}

}
