package pk01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 3, 5, 7, 9};
        List<Integer> bl = Arrays.asList(arr);

        System.out.println("arr.length is " + arr.length);
        
        Iterator<Integer> it = bl.iterator();
        while(it.hasNext()) {
            int e = it.next();
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
