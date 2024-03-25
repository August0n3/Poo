package abstracao_polimorfismo_e_interface.biblioteca;

public class Livro implements ItemDeBiblioteca {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;
    private int corredor;
    private char prateleira;
    private boolean emprestado = false;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, int corredor, char prateleira) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
        this.corredor = corredor;
        this.prateleira = prateleira;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getAnoDaEdicao() {
        return anoDaEdicao;
    }

    public void setAnoDaEdicao(int anoDaEdicao) {
        this.anoDaEdicao = anoDaEdicao;
    }

    public int getCorredor() {
        return corredor;
    }

    public void setCorredor(int corredor) {
        this.corredor = corredor;
    }

    public char getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(char prateleira) {
        this.prateleira = prateleira;
    }


    public String descricao() {
        
        return String.format("Livro de titulo %s de %d páginas escrito pelo autor %s e o ano de edição é %d ",this.titulo,this.numeroDePaginas,this.autor,this.anoDaEdicao);
    }

    public void devolve() {
        this.emprestado = false;
        
    }

    public void empresta() {
        this.emprestado = true;
    }
    public boolean estaEmprestado() {
        if (emprestado) {
            return true;
        }else{
        return false;
        }
    }

    public String localizacao() {
        return String.format("Corredor %d, prateleira %c",this.corredor,this.prateleira);
    }

    public String qualTitulo(){
        return this.titulo;
    }
    
    public String qualAutor(){
        return this.autor;
    }
    
    public String toString() {
        return "Livro" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", anoDaEdicao=" + anoDaEdicao +
                ", corredor=" + corredor +
                ", prateleira=" + prateleira +
                ", emprestado=" + emprestado +
                '\'';
    }

}
