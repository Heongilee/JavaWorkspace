package p24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] characters = s.toCharArray();

        for (int i=0;i < s.length();i++) {
            System.out.println("\'"+ characters[i] +"\'");
        }

    }
}
