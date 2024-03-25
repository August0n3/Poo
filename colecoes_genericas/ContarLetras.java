package colecoes_genericas;

import java.util.*;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap <Character, Integer> map = new TreeMap<>(); 
        String entrada = input.nextLine();
        entrada = entrada.toUpperCase();
        input.close();
        char letter;
        System.out.printf("Entrada %s \n",entrada);

        for(int i = 0; i<entrada.length(); i++){
            letter = entrada.charAt(i);
            if (map.containsKey(letter) && letter != ' ') {
                map.put(letter,map.get(letter)+1);
            }else if(letter != ' '){
                map.put(letter, 1);
            }
        }
        for (char key : map.keySet()) {
            System.out.printf("%c : %d\nJ",key,map.get(key));
        }
    }   
}
