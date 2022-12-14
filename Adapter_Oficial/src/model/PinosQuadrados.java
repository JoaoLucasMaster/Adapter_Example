package model;

public class PinosQuadrados {
	
	private double largura;

    public PinosQuadrados(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public double getQuadrado() {
        double resultado;
        resultado = Math.pow(this.largura, 2);
        return resultado;
    }
}
