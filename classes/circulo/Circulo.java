package classes.circulo;

public class Circulo{
    private double raio;
    public static final double pi = 3.1415;

    Circulo(double raio){
        this.raio = raio;
    }

    public double perimetro(){
        return 2*pi*this.raio;
    }

}