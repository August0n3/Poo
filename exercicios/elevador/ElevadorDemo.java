package exercicios.elevador;

public class ElevadorDemo {

    public static void main(String[] args) {
        Elevador elevador = new Elevador(3, 5
        , 5, 3);

        System.out.println(elevador.getNumeroAndar());
        elevador.desce();
        System.out.println(elevador.getNumeroAndar());
        System.out.println(elevador.getPessoasElevador());
        elevador.entra();
        System.out.println(elevador.getPessoasElevador());
        elevador.entra();
        elevador.entra();
        elevador.entra();
    }
}