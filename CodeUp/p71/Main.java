package p71;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int e = sc.nextInt();

            if(e == 0) {
                break;
            }
            else {
                System.out.println(e);
            }
        }
    }
}
