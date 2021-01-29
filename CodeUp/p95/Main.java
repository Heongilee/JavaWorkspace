package p95;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String nums = sc.nextLine();
        String[] arr = nums.split(" ");
        
        int res = 23;
        for(int i=0;i<n;i++) {
            int e = Integer.parseInt(arr[i]);

            if(e < res) {
                res = e;
            }
        }
        System.out.println(res);
    }
}
