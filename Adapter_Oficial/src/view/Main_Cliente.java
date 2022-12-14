package view;
import model.*;



public class Main_Cliente {

	public static void main(String[] args) {
		
		// Redondos cabem nos redondos, nenhuma surpresa.
        BuracoFormatoRedondo buraco = new BuracoFormatoRedondo(5);
        PinosRedondos pinoRedondo = new PinosRedondos(5);
        if (buraco.encaixar(pinoRedondo)) {
            System.out.println("O pino redondo de raio 5 cabe no buraco redondo de raio 5.");
        }

        PinosQuadrados pinoQuadradoPequeno = new PinosQuadrados(2);
        PinosQuadrados pinoQuadradoLargo = new PinosQuadrados(20);
        // Se usar buraco.encaixar(pinoQuadradoPequeno) // Não compila.

        // Adaptador resolve o problema.
        AdaptadorPinosQuadrados pinoQuadradoPequenoAdapter = new AdaptadorPinosQuadrados(pinoQuadradoPequeno);
        AdaptadorPinosQuadrados pinoQuadradoLargoAdapter = new AdaptadorPinosQuadrados(pinoQuadradoLargo);
        if (buraco.encaixar(pinoQuadradoPequenoAdapter)) {
            System.out.println("O pino quadrado de largura dois, cabe no buraco de raio 5.");
        }
        if (!buraco.encaixar(pinoQuadradoLargoAdapter)) {
            System.out.println("O pino quadrado de largura 20 não encaixa no buraco redondo de raio 5");
        }
    }

	}


