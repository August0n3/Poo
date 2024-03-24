package reusodeclasses.funcionario;

public class Tecnico extends Assistente{
    private float bonus;

    public Tecnico(String nome, float salario, int matricula,float bonus) {
        super(nome, salario, matricula);
        this.bonus = bonus;
        this.salario += this.bonus;
    }
    // Getters
    public float getBonus() {
        return bonus;
    }

    // Setters
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float ganhoAnual(){
        return this.salario*13 - this.bonus;
    }

    // toString

    public String toString() {
        return super.toString() + "Técnico bonus= " + bonus;

    }
}
