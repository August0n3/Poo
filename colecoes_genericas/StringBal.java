package colecoes_genericas;
import java.util.*;
public class StringBal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bal = input.nextLine();
        input.close();

        Stack<Character> pilha = new Stack<>();

        for(int i = 0; i<bal.length();i++){
            pilha.push(bal.charAt(i));
        }
        int fech = 0;
        char par;
        boolean isBal = true;
        while (!pilha.isEmpty()) {
            par = pilha.pop();
            if(par == ')'){
                fech++;
            }else if(fech>0){
                fech --;
            }else{
                isBal = false;
                break;
            }
        }
        if (fech ==0 && isBal == true) {
            System.out.println("Está Balanceada");
        }else{
             System.out.println("Não está Balanceada!");
        }
    }
}
