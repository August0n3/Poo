package abstracaopolieinterface.figurageometrica;

public class Quadrado extends FiguraGeometrica {
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

   
    public String desenha() {
        return "Um quadrado de lado: " + lado;
    }


        

}
