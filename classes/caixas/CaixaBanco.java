package classes.caixas;

public class CaixaBanco{
    private int numeroCaixa;
    private static int clientesAtendidos = 0;

    CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento(){
        System.out.println("Caixa "+ numeroCaixa + "atendeu o cliente " + clientesAtendidos+1);
        clientesAtendidos++;
    }
}   