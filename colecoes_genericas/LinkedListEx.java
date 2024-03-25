package colecoes_genericas;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> ex01 = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        LinkedList<Integer> ex01Inversa = new LinkedList<Integer>();
        ListIterator<Integer> ex01It = ex01.listIterator();

        while (ex01It.hasNext())
            ex01It.next();
        while (ex01It.hasPrevious())
            ex01Inversa.add(ex01It.previous());
            
        
        System.out.println("Lista: "+ ex01);
        System.out.println("Lista invertida" + ex01Inversa);
        
            
        




    }
}
