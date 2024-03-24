package arrays.agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> entradas;

    public Agenda(){
        this.entradas = new ArrayList<EntradaEmAgenda>();
    }

    public void adicionarEntrada(EntradaEmAgenda entrada){
        entradas.add(entrada);
    }

    public  ArrayList<EntradaEmAgenda> listaDia(int dia, int mes, int ano){
        ArrayList<EntradaEmAgenda> retornos = new ArrayList<EntradaEmAgenda>();
        for (EntradaEmAgenda i : this.entradas) {
            if (i.dia == dia && i.mes == mes && i.ano == ano) {
                retornos.add(i);
            }
            
        }
        return retornos;
    }
}
