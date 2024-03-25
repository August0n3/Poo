package reusodeclasses.livros;

public class LivroBiblioteca extends Livro{
    private String data_alugel;
    private String data_dev;
    
    
    public LivroBiblioteca(String autor, int paginas, String genero, String data_alugel, String data_dev) {
        super(autor, paginas, genero);
        this.data_alugel = data_alugel;
        this.data_dev = data_dev;
    }

    public String getData_alugel() {
        return data_alugel;
    }


    public void setData_alugel(String data_alugel) {
        this.data_alugel = data_alugel;
    }


    public String getData_dev() {
        return data_dev;
    }


    public void setData_dev(String data_dev) {
        this.data_dev = data_dev;
    }

    public String toString() {
        return super.toString() + "Data de alguel '= "+ data_alugel + '\''+ 
                                "Data para devolucao" + data_dev;
    }
}   
