package reusodeclasses.computador;

public class TesteEquipamento {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento(2002, 180f);
        Computador computador = new Computador(2008, 2000f, 8, "intel Celeron");

        System.out.println(computador);
        System.out.println(equipamento);

    }
}
