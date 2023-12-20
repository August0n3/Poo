package classes.pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João Maria", 1.67);
        p.setAltura(1.70);
        System.out.println(p.getAltura());
        System.out.println(p);        
    }
}
