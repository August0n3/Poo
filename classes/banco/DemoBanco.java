package classes.banco;

public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Arthur");
        System.out.println(conta1);

        ContaBancaria conta2 = new ContaBancaria("Aline",1234.2,true);
        System.out.println(conta2);
    }    
}
