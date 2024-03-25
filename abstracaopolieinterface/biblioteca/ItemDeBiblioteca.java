package abstracaopolieinterface.biblioteca;

public interface ItemDeBiblioteca {
    public static int maximoDeDiasParaEmprestimo = 14;
    public boolean estaEmprestado();

    public void empresta();
    
    public void devolve();
    
    public String localizacao();

    public String descricao();


}