package abstracao_polimorfismo_e_interface.figurageometrica;

public class Circulo extends FiguraGeometrica {
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public String desenha() {
        return "Uma figura circular de raio: " + raio;
    }
 
}
