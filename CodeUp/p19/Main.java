package p19;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringTokenizer tk = new StringTokenizer(s, ".");
        int [] arr = new int[3];

        int i = 0;
        while(tk.hasMoreTokens()) {
            arr[i] = Integer.parseInt(tk.nextToken());
            i += 1;
        }

        // 출력
        System.out.println(String.format("%04d", arr[0]) + "." + String.format("%02d", arr[1]) + "." + String.format("%02d", arr[2]));
    }   
}
