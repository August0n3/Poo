package reusodeclasses.computador;

public class Computador extends Equipamento {
    private int mem_ram;
    private String processador;

    
    public Computador(int ano_lanc, float preco, int mem_ram, String processador) {
        super(ano_lanc, preco);
        this.mem_ram = mem_ram;
        this.processador = processador;
    }

    public int getMem_ram() {
        return mem_ram;
    }

    public void setMem_ram(int mem_ram) {
        this.mem_ram = mem_ram;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String toString() {
        return super.toString() + ". Memória Ram = " + mem_ram+"gb. Processador = "+ processador;
    }
}