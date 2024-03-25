package abstracao_polimorfismo_e_interface.figurageometrica;

public class Triangulo extends FiguraGeometrica {
    private float l1;
    private float l2;
    private float l3;
    
    public Triangulo(float l1, float l2, float l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public float getL1() {
        return l1;
    }

    public void setL1(float l1) {
        this.l1 = l1;
    }

    public float getL2() {
        return l2;
    }

    public void setL2(float l2) {
        this.l2 = l2;
    }

    public float getL3() {
        return l3;
    }

    public void setL3(float l3) {
        this.l3 = l3;
    }

    public String desenha() {
        return "Um triangulo de lados: "+ this.l1 + " " + this.l2 +" "+ this.l3;
    }
    
}
