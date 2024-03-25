package reusodeclasses.livros;

public class Livro {
    private String autor;
    private int paginas;
    private String genero;

    public Livro(String autor, int paginas, String genero) {
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro" +
                "autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", genero='" + genero + '\'';
    }
}
