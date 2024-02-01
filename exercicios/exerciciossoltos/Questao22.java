package exercicios.exerciciossoltos;

import java.util.Scanner;


public class Questao22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o grau do polinomio");
        int n = input.nextInt();
        System.out.println(polinomio(n, input));
        
        input.close();
    }

    public static Double polinomio(int n, Scanner input){
        System.out.println("Digite o termo variável (x)");
        int x = input.nextInt();
        if (n == 0) {
            System.out.println("Digite o termo independente");
            Double a = input.nextDouble();
            return (a);
        }else{
            System.out.println("Digite o termo independente");
            Double a = input.nextDouble();
            return(Math.pow(x , n) + a + polinomio(n-1, input));
        }
    }
    
}