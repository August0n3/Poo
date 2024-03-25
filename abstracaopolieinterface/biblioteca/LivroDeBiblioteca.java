package abstracaopolieinterface.biblioteca;

public class LivroDeBiblioteca extends Livro {
    private String nomeDaBiblioteca;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, int corredor,
            char prateleira, String nomeDaBiblioteca) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao, corredor, prateleira);
        this.nomeDaBiblioteca = nomeDaBiblioteca;
    }

    public String getNomeDaBiblioteca() {
        return nomeDaBiblioteca;
    }

    public void setNomeDaBiblioteca(String nomeDaBiblioteca) {
        this.nomeDaBiblioteca = nomeDaBiblioteca;
    }
    
    public String toString() {
        return super.toString() + "Nome da biblioteca = " + this.nomeDaBiblioteca;
    }

}
