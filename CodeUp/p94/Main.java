package p94;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();
        String[] arr = num.split(" ");

        for (int i = n - 1;i >= 0;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
