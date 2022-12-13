
public class Main {

	public static void main(String[] args) {
		AdapterCotacao conversao = new AdapterCotacao();
		
		conversao.setValor(7);
		
		System.out.print("Valor em dolar:"+conversao.getValorDolar());
		System.out.println("");
		System.out.print("Valor em real:"+conversao.getValor());
		

	}

}
