package arrays.cliente;

import java.util.ArrayList;
import java.util.Scanner;   

public class DemoCliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> clientes= new ArrayList<Cliente>();
        int id = 0;
        while (true) {
            System.out.println("Enter ID:");
            id = input.nextInt();
            if (id>=0) {
                System.out.println("Enter Nome:");
                String nome = input.next();
                System.out.println("Enter Idade:");
                int idade = input.nextInt();
                System.out.println("Enter Telefone:");
                String telefone = input.next();
                Cliente cliente = new Cliente(id, nome, idade, telefone);
                clientes.add(cliente);
            }else{
                System.out.println("Id negativo!");
                break;
            }
            
        }   
        for (Cliente i : clientes) {
            System.out.println("-----------------------");
            System.out.println(i.toString());
        }
        input.close();
    }
}
