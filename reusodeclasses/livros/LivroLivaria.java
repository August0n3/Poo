package reusodeclasses.livros;

public class LivroLivaria extends Livro {
    
    private float preco;
    
    public LivroLivaria(String autor, int paginas, String genero, float preco, int seccao) {
        super(autor, paginas, genero);
        this.preco = preco;
;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
 

    @Override
    public String toString() {
        return super.toString() + "Preço = " + preco;
    }
    
}
