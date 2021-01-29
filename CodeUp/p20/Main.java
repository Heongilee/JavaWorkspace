package p20;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer stk = new StringTokenizer(s, "-");
        String res = "";

        while(stk.hasMoreTokens()) {
            res += stk.nextToken();
        }
        System.out.println(res);
    }
}
