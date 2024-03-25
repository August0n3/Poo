package arrays_arrayslists.matriz;

public class DemoMatriz {
    public static void main(String[] args) {
        float n00 =  1f;
        float n01 =  0f;
        float n10 =  0f;
        float n11 =  1f;

        Matriz matriz = new Matriz(n00, n01, n10, n11);
        System.out.println(matriz.toString());
        System.out.println(matriz.determinante());
    }
}
