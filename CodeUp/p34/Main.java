package p34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String octalNum = sc.nextLine();
        int num = Integer.parseInt(octalNum, 8);

        System.out.println(num);
    }
    
}
