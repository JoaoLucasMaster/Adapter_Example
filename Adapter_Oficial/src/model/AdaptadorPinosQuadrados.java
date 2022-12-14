package model;

public class AdaptadorPinosQuadrados extends PinosRedondos {
	
	private PinosQuadrados pino;

    public AdaptadorPinosQuadrados(PinosQuadrados pino) {
        this.pino = pino;
    }

    @Override
    public double getRaio() {
        double result;
        //Calcula o menor raio do circulo que caberia este pino
        result = (Math.sqrt(Math.pow((pino.getLargura() / 2), 2) * 2));
        return result;
    }
}
