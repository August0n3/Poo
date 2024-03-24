package reusodeclasses.funcionario;

public class Funcionario {
    protected String nome;
    protected float salario;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentarSalario(float aumento){
        this.salario+=aumento;
    }

    public float ganhoAnual(){
        return salario*13;
    }

    public String toString() {
        return "Funcionario nome=" + nome + ", salario=" + salario;
    }
    
}
