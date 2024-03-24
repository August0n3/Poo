package reusodeclasses.computador;

public class Equipamento {
    private int ano_lanc;
    private float preco;

    public Equipamento(int ano_lanc, float preco) {
        this.ano_lanc = ano_lanc;
        this.preco = preco;
    }

    public int getAno_lanc() {
        return ano_lanc;
    }

    public void setAno_lanc(int ano_lanc) {
        this.ano_lanc = ano_lanc;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Ano de laçamento = " + ano_lanc+ ". Preço = " + preco;
    }
}
