package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> lista= new ArrayList<>(6);
        lista.add(2);
        lista.add(4);
        lista.add(0);
        lista.add(3);
        Collections.sort(lista);
        //index 0 1 2 3
        //value 0 2 3 4

        System.out.println(Collections.binarySearch(lista,4));
        System.out.println(Collections.binarySearch(lista,3));

    }
}
