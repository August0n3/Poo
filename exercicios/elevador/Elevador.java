package exercicios.elevador;

public class Elevador {
    private int numeroAndar;
    private int totalAndares;
    private int capacidaDePessoas;
    private int pessoasElevador;
    
    public int getNumeroAndar() {
        return numeroAndar;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidaDePessoas() {
        return capacidaDePessoas;
    }

    public int getPessoasElevador() {
        return pessoasElevador;
    }

    public Elevador(int numeroAndar, int totalAndares, int capacidaDePessoas, int pessoasElevador) {
        this.numeroAndar = numeroAndar;
        this.totalAndares = totalAndares;
        this.capacidaDePessoas = capacidaDePessoas;
        this.pessoasElevador = pessoasElevador;
    }

    public void entra(){
        if (this.pessoasElevador<this.capacidaDePessoas){
            pessoasElevador++;
            System.out.println("Uma pessoa entrou no elevador");
        }else{
            System.out.println("Elevador cheio!");
        }
    }
    public void sai(){
        if (this.pessoasElevador>0){
            pessoasElevador--;
            System.out.println("Uma pessoa saiu do elevador");
        }else{
            System.out.println("Elevador vazio!");
        }
    }
    public void sobre(){
        if (this.numeroAndar<totalAndares){
            numeroAndar++;
            System.out.println("Elevador subiu um andar");
        }else{
            System.out.println("Elevador no ultimo andar");
        }
    }
    public void desce(){
        if (this.numeroAndar>0){
            numeroAndar--;
            System.out.println("Elevador desceu um andar");
        }else{
            System.out.println("Elevador no terreo!");
        }
    }
    
}
