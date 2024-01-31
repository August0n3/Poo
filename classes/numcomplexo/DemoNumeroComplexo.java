package classes.numcomplexo;

public class DemoNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo num1 = new NumeroComplexo(-3,42);
        NumeroComplexo num2 = new NumeroComplexo(2);
        NumeroComplexo num3 = new NumeroComplexo();

        System.out.println(num1.toString());
        System.out.println(num2.toString());
        System.out.println(num3.toString());
    }
}
