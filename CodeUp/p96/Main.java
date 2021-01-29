package p96;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] board = new int[20][20];
        int n = sc.nextInt();

        for(int i = 0;i < n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            board[a][b] = 1;
        }
        for(int i=1;i<20;i++) {
            for(int j=1;j<20;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
