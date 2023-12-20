package classes.pessoa;

public class Pessoa{
    private String nome;
    private double altura;

    Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }
    
    public String getNome(){
        return "Nome: "+ this.nome;
    }

    public void setNome(String novoNome){
        if (!novoNome.equals(" ")){
            this.nome = novoNome;
        }else{
            System.out.println("Novo nome invalido");
        }
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double novaAltura){
        if(novaAltura > 0){
            this.altura = novaAltura;
        }else{
            System.out.println("A altura não pode ser nula nem negativa!");
        }
    }

    public String toString(){
        String res = "";
        res += "Nome: " + this.nome +"\n";
        res += "Altura: " + this.altura+"\n";
        return res;
    }

}