package arrays_arrayslists.agenda;

public class EntradaEmAgenda {
    public String hora;
    public int dia;
    public int mes;
    public int ano;
    public String assunto;

    public EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano){
        if (this.dia == dia && this.mes == mes && this.ano == ano) {
            return true;
        } else{
            return false;
        }
    }

    public String toString() {
        return String.format("Hora: %s, Dia: %d, Mes: %d, Ano: %d, Assunto: %s", this.hora, this.dia, this.mes, this.ano, this.assunto);
    }
}
