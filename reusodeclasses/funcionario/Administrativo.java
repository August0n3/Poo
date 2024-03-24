package reusodeclasses.funcionario;

public class Administrativo extends Assistente{
    private boolean turno;
    private float bonus;

    public Administrativo(String nome, float salario, int matricula,float bonus, boolean turno) {
        super(nome, salario, matricula);
        this.turno = turno;
        if (this.turno) {
            this.bonus = bonus;
            this.salario += this.bonus;
        }
        
    }
    // Getters
    public float getBonus() {
        return bonus;
    }

    public boolean isTurno() {
        return turno;
    }

    // Setters
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public float ganhoAnual(){
        return this.salario*13 - this.bonus;
    }

    // toString
    public String toString() {
        return super.toString() + "Administrativo bonus= " + bonus + " Turno= " + (this.turno?"Nortuno":"Diurno");

    }
}
