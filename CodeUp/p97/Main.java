package p97;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[][] board = new String[20][20];
            
            // board 입력 받기
            for(int i=1;i <= 19;i++) {
                String[] ar = br.readLine().split(" ");
                for(int j=1;j <= 19;j++) {
                    board[i][j] = ar[j - 1];
                }
            }
            int n = Integer.parseInt(br.readLine());
            ArrayList<String> list = new ArrayList<String>();
            for(int i=0;i<n;i++) {
                list.add(br.readLine());
            }

            for(int i=0;i<list.size();i++) {
                String[] point = list.get(i).split(" ");
                int x = Integer.parseInt(point[0]);
                int y = Integer.parseInt(point[1]);
                for(int j=1;j <= 19;j++) {
                    board[x][j] = (board[x][j] == "0") ? "1" : "0";
                }
                for(int j=1;j <= 19;j++) {
                    board[j][y] = (board[j][y] == "0") ? "1" : "0";
                }
            }

            // 결과 출력
            for(int i=1;i <= board.length - 1;i++) {
                for(int j=1;j < board[i].length;j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }

    }
}
