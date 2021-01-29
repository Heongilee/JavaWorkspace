package p28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();

        if(n < 0 || n > 4294967295L) {
            System.out.println("범위가 아닙니다.");
        }

        System.out.println(n);
    }
}
