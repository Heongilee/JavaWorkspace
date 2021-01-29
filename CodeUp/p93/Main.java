package p93;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[24];
        
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(str, " ");

        while(stk.hasMoreTokens()) {
            int e = Integer.parseInt(stk.nextToken());
            if(e >= 1 && e <= 23) {
                arr[e] += 1;
            }
        }

        for(int i=1;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
