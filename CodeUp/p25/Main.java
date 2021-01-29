package p25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String in = sc.nextLine();
        char[] numbs = in.toCharArray();
        int L = in.length();
        for (int i=0;i<L;i++) {
            int t = Character.getNumericValue(numbs[i]);
            for(int j=0;j<L - i - 1;j ++) {
                t *= 10;
            }           
            System.out.println("["+t+"]"); 
        }
    }
}
