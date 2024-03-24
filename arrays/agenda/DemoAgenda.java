package arrays.agenda;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        EntradaEmAgenda entrada1 = new EntradaEmAgenda("22:40", 6, 8, 2024, "Entrada1");
        EntradaEmAgenda entrada2 = new EntradaEmAgenda("21:40", 6, 8, 2024, "Entrada2");
        EntradaEmAgenda entrada3 = new EntradaEmAgenda("20:40", 7, 8, 2024, "Entrada3");
        EntradaEmAgenda entrada4 = new EntradaEmAgenda("19:40", 6, 8, 2024, "Entrada4");
        EntradaEmAgenda entrada5 = new EntradaEmAgenda("18:40", 7, 8, 2024, "Entrada5");

        agenda.adicionarEntrada(entrada1);
        agenda.adicionarEntrada(entrada2);
        agenda.adicionarEntrada(entrada3);
        agenda.adicionarEntrada(entrada4);
        agenda.adicionarEntrada(entrada5);
        
        for(EntradaEmAgenda i: agenda.listaDia(6,8,2024)){
            System.out.println(i.toString());
        }

    }
}
