package abstracao_polimorfismo_e_interface.biblioteca;

public class DemoLivroBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Augusto", "Augusto", 10, 2002, 2, 'D', "Centro");
        System.out.println(livro.descricao());
        System.out.println(livro.estaEmprestado());
        livro.empresta();
        System.out.println(livro.estaEmprestado());
        livro.devolve();
        System.out.println(livro.localizacao());
        System.out.println(livro);
    }
}
