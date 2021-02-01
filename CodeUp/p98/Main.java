package p98;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 23, 33, 15, 17, 19};

        // --------------------------------- 정렬 -------------------------------------
        // for(int i=0;i<arr.length;i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // Integer[] brr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Arrays.sort(brr, Collections.reverseOrder());

        // for(int e: brr) {
        //     System.out.print(e + " ");
        // }
        // System.out.println();

        // 벡터 사용방법
        // Vector<Integer> brr = new Vector<Integer>(Arrays.asList(4, 23, 33, 15, 17, 19));

        // Iterator<Integer> it = brr.iterator();
        // while(it.hasNext()) {
        //     int e = it.next();
        //     System.out.print(e + " ");
        // }
        // System.out.println();

        // ArrayList 사용
        // ArrayList<Integer> crr = new ArrayList<Integer>(Arrays.asList(4, 23, 33, 15, 17, 19));

        // System.out.println("리스트 사이즈 : " + crr.size());
        // Iterator<Integer> it = crr.iterator();
        // while(it.hasNext()) {
        //     int e = it.next();
        //     System.out.print(e + " ");
        // }
        // System.out.println();

        // Priority Queue 사용
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Arrays.asList(-4, -23, -33, -15, -17, -19));
        
        while(!pq.isEmpty()) {
            int e = pq.remove();
            System.out.print(-e + " ");
        }
        System.out.println();
    }
}
